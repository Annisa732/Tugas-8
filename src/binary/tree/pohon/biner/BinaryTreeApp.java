package binary.tree.pohon.biner;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode('D');
        tree.insert( node);
        
        node = new TreeNode('B');
        tree.insert(node);

        node = new TreeNode('A');
        tree.insert(node);

        node = new TreeNode('C');
        tree.insert(node);

        node = new TreeNode('F');
        tree.insert(node);

        node = new TreeNode('E');
        tree.insert(node);
        
        node = new TreeNode('G');
        tree.insert(node);
        
        System.out.print("Traversal dengan order :");
        tree.preOrder();
        System.out.print("Traversal dengan order :");
        tree.inOrder();
        System.out.print("Traversal dengan order :");
        tree.postOrder();
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
