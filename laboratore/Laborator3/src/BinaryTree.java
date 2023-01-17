import java.util.Stack;

public class BinaryTree<AnyType> {
    public BinaryNode<AnyType> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(AnyType x) {
        root = new BinaryNode<>(x);
    }

    public void postorderPrint(BinaryNode<AnyType> root) {
        if (root == null) {
            return;
        }

        postorderPrint(root.left);
        postorderPrint(root.right);
        System.out.print(root.element);
    }

    public void inorderPrint(BinaryNode<AnyType> root) {
        if (root == null) {
            return;
        }

        postorderPrint(root.left);
        System.out.print(root.element);
        postorderPrint(root.right);
    }

    private boolean isLeaf(BinaryNode<AnyType> node){
        return node.left == null && node.right == null;
    }

    public void createExpressionTree(String postfix) {
        Stack<BinaryNode<Character>> stack = new Stack<>();
        BinaryNode<Character> node1, node2, tempNode;

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                tempNode = new BinaryNode<>(c);

                node1 = stack.pop();
                node2 = stack.pop();

                tempNode.left = node2;
                tempNode.right = node1;

                stack.push(tempNode);
            } else {
                tempNode = new BinaryNode<>(c);
                stack.push(tempNode);
            }
        }

        tempNode = stack.pop();
        root = (BinaryNode<AnyType>) tempNode;

    }

    public int calculate(BinaryNode<Character> root){
        if (root == null){
            return 0;
        }

        if (isLeaf((BinaryNode<AnyType>) root)){
            return Character.getNumericValue(root.element);
        }
        int left = calculate(root.left);
        int right = calculate(root.right);

        int value = 0;

        switch (root.element){
            case '+':
                value = left + right;
                break;
            case '-':
                value = left - right;
                break;
            case '*':
                value = left * right;
                break;
            default:
                value = left / right;
        }

        return value;
    }
}
