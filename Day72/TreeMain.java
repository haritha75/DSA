public class TreeMain {

    public static void main(String[] args) {
        
        Tree tree=new Tree();
        tree.insert(44);
        tree.insert(21);
        tree.insert(79);
        tree.insert(75);
        tree.insert(32);
        tree.levelOrderTraverse(tree.root);
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        System.out.println(tree.isBST(tree.root, min, max));
        System.out.println(tree.contains(tree.root, 45));
        tree.nodeAtKDistance(tree.root, 1);
        System.out.println();
        tree.levelOrderTraverse(tree.root);
    }
    
}
