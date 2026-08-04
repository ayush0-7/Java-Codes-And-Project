public class Tree {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

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

    static int total_Node(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + total_Node(root.left) + total_Node(root.right);

    }

    static int total_leaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return total_leaves(root.left) + total_leaves(root.right);

    }

    static int height_tree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + height_tree(root.left);
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    static boolean search(Node root, int ele) {
        if (root == null) {
            return false;
        }
        if (root.data == ele) {
            return true;
        }

        return search(root.left, ele) || search(root.right, ele);
    }

    static void mirror_tree(Node root){
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror_tree(root.left);
        mirror_tree(root.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        Preorder(tree.root);
        System.out.println();
        System.out.println("Total Nodes :" + total_Node(tree.root));
        System.out.println();
        System.out.print("Total leaves :" + total_leaves(tree.root));
        System.out.println();
        System.out.print("Height of tree :" + height_tree(tree.root));
        System.out.println();
        System.out.print("Sum of data :" + sum(tree.root));
        System.out.println();
        System.out.println("Search for element :" + search(tree.root, 10));


        mirror_tree(tree.root);
        Preorder(tree.root);
    }
}
