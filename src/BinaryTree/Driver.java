package BinaryTree;

public class Driver {
    /* Driver program to test functions */
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\n Height of tree is " );
        System.out.println(tree.maxDepth(tree.root));

        System.out.println("\n Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);

        System.out.println("\n Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

        System.out.println("\n Postorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
    }
}
