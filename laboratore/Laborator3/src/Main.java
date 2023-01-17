import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        infixToPostfix("2+3*4");
        infixToPostfix("a*b+5");
        infixToPostfix("(1+2)*7");
        infixToPostfix("a*b/c");
        infixToPostfix("(a/(b-c+d))*(e-a)*c");
        infixToPostfix("a/b-c+d*e-a*c");

    }

    public static void infixToPostfix(String infixExp){
        System.out.println(infixExp);
        String postfix = infixToPostfixString(infixExp);
        calculateValue(postfix);
    }

    private static String infixToPostfixString(String infixExp) {
        Stack<Character> expStack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infixExp.length(); i++) {
            char c = infixExp.charAt(i);

            if (c == '(') {
                expStack.push(c);
            } else if (c == ')') {
                while (!expStack.isEmpty() && expStack.peek() != '(') {
                    postfix += expStack.pop();
                }

                if(!expStack.isEmpty())
                    expStack.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!expStack.isEmpty() && priority(c) <= priority(expStack.peek())) {
                    postfix += expStack.pop();
                }
                expStack.push(c);
            } else {
                postfix += c;
            }
        }

        while (!expStack.isEmpty()) {
            postfix += expStack.pop();
        }

        return postfix;
    }

    private static void calculateValue(String postfix){
        BinaryTree<Character> expression = new BinaryTree<>();
        expression.createExpressionTree(postfix);

        System.out.print("Postfix: ");
        expression.postorderPrint(expression.root);
        if (checkIfNumericExpression(postfix)){
            System.out.print("\nVlera e shprehjes: " + expression.calculate(expression.root));
        }

        System.out.println("\n");
    }

    private static boolean checkIfNumericExpression(String postfix){
        if (Character.isDigit(postfix.charAt(0))){
            return true;
        }
        return false;
    }

    private static int priority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        }
        return 0;
    }

}