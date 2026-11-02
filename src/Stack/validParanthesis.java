
package Stack;

import java.util.Stack;

public class validParanthesis {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }

            else {

                if (st.empty())
                    return false;

                char top = st.pop();

                if ((top == '(' && ch == ')') ||
                        (top == '[' && ch == ']') ||
                        (top == '{' && ch == '}')) {

                    continue;
                }

                else {
                    return false;
                }
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {

        String s = "([])";

        System.out.println(isValid(s));
    }
}
