//package Stack_Problems;
//
//
//import java.util.Stack;
//
//class InfixToPostfix {
//
//    static int priority(char ch) {
//
//        if (ch == '^')
//            return 3;
//
//        else if (ch == '*' || ch == '/')
//            return 2;
//
//        else if (ch == '+' || ch == '-')
//            return 1;
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//
//        String s = "A+B*C";
//
//        Stack<Character> st = new Stack<>();
//
//        String ans = "";
//
//        int i = 0;
//        int n = s.length();
//
//        while (i < n) {
//
//            // Operand
//            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
//                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
//                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
//
//                ans = ans + s.charAt(i);
//            }
//
//            // Opening bracket
//            else if (s.charAt(i) == '(') {
//                st.push(s.charAt(i));
//            }
//
//            // Closing bracket
//            else if (s.charAt(i) == ')') {
//
//                while (!st.isEmpty() && st.peek() != '(') {
//                    ans = ans + st.pop();
//                }
//
//                st.pop();
//            }
//
//            // Operator
//            else {
//
//                while (!st.isEmpty() &&
//                        st.peek() != '(' &&
//                        (priority(st.peek()) > priority(s.charAt(i)) ||
//                                (priority(st.peek()) == priority(s.charAt(i)) && s.charAt(i) != '^'))) {
//
//                    ans = ans + st.pop();
//                }
//
//                st.push(s.charAt(i));
//            }
//
//            i++;
//        }
//
//        // Pop remaining operators
//        while (!st.isEmpty()) {
//            ans = ans + st.pop();
//        }
//
//        System.out.println("Postfix: " + ans);
//    }
//}
