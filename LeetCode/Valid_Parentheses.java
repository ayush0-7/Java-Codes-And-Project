import javax.print.DocFlavor.STRING;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String str = "[{()}]";
        int l = str.length();
        char stack[] = new char[l];
        int top = -1, k = 0;
        for (int i = 0; i < stack.length; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                if (top == -1) {
                    k = 0;
                }
                char last = stack[top--];
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    k = 1;
                }
            }
        }
        if (top==-1) {
            System.out.println("valid");
        }else{
            System.out.println("not");
        }
    }
}
