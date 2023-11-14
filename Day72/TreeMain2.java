public class TreeMain2 {

    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.leftChild = new Node(11);
        root.rightChild=new Node(8);
        root.leftChild.leftChild = new Node(12);
        root.rightChild.rightChild = new Node(32);

        Tree tree = new Tree();
        tree.printOneChild(root);
        System.out.println();
        tree.binaryNode(root);

        Node root1 = new Node(10);
        root1.leftChild = new Node(11);
        root1.rightChild=new Node(8);
        root1.leftChild.leftChild = new Node(12);
        root1.rightChild.rightChild = new Node(32);
        root1.leftChild.rightChild= new Node(14);
        root1.rightChild.leftChild=new Node(43);

        System.out.println(tree.isFullBT(root1));
        System.out.println(tree.height(root));
        System.out.println();
        System.out.println(tree.isPerfectBT(root1));
        System.out.println();
        //System.out.println(tree.isPerfectBT(root));
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println();

        Node root2= new Node(1);
        root2.leftChild= new Node(2);
        root2.rightChild= new Node(3);
        root2.leftChild.leftChild=new Node(4);
        root2.leftChild.rightChild=new Node(5);
        root2.rightChild.leftChild=new Node(6);

        System.out.println(tree.completeBT(root2));




    }
    
}
