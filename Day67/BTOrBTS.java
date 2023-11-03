public class BTOrBTS {

    private class Node {

        private int data;

        public Node(int data) {
            this.data=data;
        }

        private Node leftChild;
        private Node rightChild;

        @Override
        public String toString() {
            return Integer.toString(data);
        }

    }
    public Node root;

    public void insert(int data) {

        if(root==null) {
            Node node=new Node(data);
            root=node;
            return;
        }

        var current=root;

        while(true) {

            if(current.data > data) { //leftside

                if(current.leftChild==null) {
                    current.leftChild=new Node(data);
                    break;
                }
                else {
                    current=current.leftChild;
                }

            }

            else {  //rightside

                if(current.rightChild==null) {
                    current.rightChild=new Node(data);
                    break;
                }
                else {
                    current=current.rightChild;
                }

            }
        }
    }

    public boolean find(int data) {

        var current=root;

        while(current!=null) {

            if(current.data==data) { // at certain point both data are equal then return true
                return true;
            }
            else if(current.data > data) { //leftside
                current=current.leftChild;
            }
            else {  //rightside
                current=current.rightChild;
            }
        }
        return false;
    }
}