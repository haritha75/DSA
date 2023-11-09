public class TreeMain {

    public static void main(String[] args) {
        
        Tree bts=new Tree();

        bts.insert(45);
        bts.insert(15);
        bts.insert(79);
        bts.insert(90);
        bts.insert(10);
        bts.insert(55);
        bts.insert(12);
        bts.insert(20);
        bts.insert(50);

        System.out.println(bts.find(33));
        System.out.println(bts.find(11));

        bts.preOrder(bts.root);
        System.out.println();
        bts.inOrder(bts.root);
        System.out.println();
        bts.postOrder(bts.root);
        System.out.println();
        

        System.out.println(bts.max(bts.root));
        System.out.println();
        System.out.println(bts.min(bts.root));

        System.out.println(bts.height(bts.root));
        System.out.println(bts.noOfLeafNodes(bts.root));

        System.out.println(bts.sizeOfTree(bts.root));
        System.out.println();
        bts.leftNodes(bts.root);
        System.out.println();
        bts.rightNodes(bts.root);

        System.out.println();
        bts.leftRightNodes(79);

        System.out.println();
        bts.nodeAtKDistance(bts.root,1);


    }
    
}
