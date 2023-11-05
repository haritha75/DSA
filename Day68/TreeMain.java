public class TreeMain {

    public static void main(String[] args) {
        
        Tree bts=new Tree();

        bts.insert(44);
        bts.insert(77);
        bts.insert(45);
        bts.insert(33);
        bts.insert(34);
        bts.insert(23);
        bts.insert(36);
        bts.insert(21);

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


    }
    
}
