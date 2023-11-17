public class TreeMain {

    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.insert(45);
        tree.insert(33);
        tree.insert(46);
        tree.insert(22);
        tree.insert(34);
        tree.insert(47);

        tree.printLeftAndRight(33);

    }
    
}
