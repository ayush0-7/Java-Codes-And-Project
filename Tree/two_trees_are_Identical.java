public class two_trees_are_Identical {
    Node root;

    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        Preorder(root.left);
        Preorder(root.right);

    }

    static boolean Identical(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        return Identical(root1.left, root2.left)
                && Identical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        two_trees_are_Identical tree1 = new two_trees_are_Identical();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(7);
        tree1.root.right = new Node(3);
        tree1.root.right.left = new Node(6);

        two_trees_are_Identical tree2 = new two_trees_are_Identical();
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.right = new Node(3);
        tree2.root.right.left = new Node(6);
        Preorder(tree1.root);
        System.out.println();
        Preorder(tree2.root);
        System.out.println();
        System.out.println(Identical(tree1.root, tree2.root));
    }
}