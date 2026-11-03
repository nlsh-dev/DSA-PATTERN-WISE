package Stack_Problems;

import java.util.Stack;

class InfixToPostfix {

    public static int precedence(char ch) {

        if(ch == '^') {
            return 3;
        }
        else if(ch == '*' || ch == '/') {
            return 2;
        }
        else if(ch == '+' || ch == '-') {
            return 1;
        }

        return -1;
    }

    public static String convert(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If operand
            if(Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            // If opening bracket
            else if(ch == '(') {
                st.push(ch);
            }

            // If closing bracket
            else if(ch == ')') {

                while(!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }

                st.pop();
            }

            // If operator
            else {

                while(!st.isEmpty() &&
                        st.peek() != '(' &&
                        (precedence(ch) < precedence(st.peek()) ||
                                (precedence(ch) == precedence(st.peek()) && ch != '^'))) {

                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        // Pop remaining operators
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String infix = "A+B*(C-D)/E";

        String postfix = convert(infix);

        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}
