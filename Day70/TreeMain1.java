public class TreeMain1 {

    public static void main(String[] args) {
        
        Tree tree=new Tree();

        tree.insert(41);
        tree.insert(42);
        tree.insert(39);
       

        Tree tree1=new Tree();
        tree1.insert(41);
        tree1.insert(42);
        tree1.insert(39);
        


        
         Tree tree2 = new Tree();
         tree2.mirrorInsert(41);
         tree2.mirrorInsert(42);
         tree2.mirrorInsert(39);
        

        System.out.println(tree.twoTreesSameOrNot(tree.root,tree1.root));
        System.out.println(tree.mirrorImageSameOrNot(tree.root,tree2.root));

    }
    
}
