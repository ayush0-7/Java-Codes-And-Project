public class All_type_of_traversal {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    static int idx = -1;

    static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    static void Preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "->");
        Preorder(root.left);
        Preorder(root.right);
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + "->");
        Inorder(root.right);
    }

    static void Postorder(Node root){
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+ "->");
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildTree(nodes);
        Preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        Postorder(root);
    }

}
