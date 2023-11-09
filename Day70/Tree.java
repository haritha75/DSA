public class Tree {

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

    public void preOrder(Node root) { //root left right

        if(root==null)
          return;

       System.out.println(root.data);
       preOrder(root.leftChild);
       preOrder(root.rightChild);

    }
    public void inOrder(Node root) { // left root  right

        if(root==null)
          return;

       inOrder(root.leftChild);
       System.out.println(root.data);
       inOrder(root.rightChild);

    }

    public void postOrder(Node root) { // left  right root

        if(root==null)
          return;

       postOrder(root.leftChild);
       postOrder(root.rightChild);
       System.out.println(root.data);


    }

    public int max(Node root) {

        if(root.rightChild==null)
          return root.data;
        return max(root.rightChild);
    }

     public int min(Node root) {

        if(root.leftChild==null)
          return root.data;
        return max(root.leftChild);
    }

    public int height(Node root) {

        if(root==null)
          return 0;
          
        return 1+Math.max(height(root.leftChild),height(root.rightChild));
    }
    public int noOfLeafNodes(Node root) {

        if(root==null)
          return 0;
        else if(root.leftChild==null && root.rightChild==null)
          return 1;
        else
          return noOfLeafNodes(root.leftChild) + noOfLeafNodes(root.rightChild); 
    }

     public int sizeOfTree(Node root) {

        if(root==null)
          return 0;
        
          return 1+sizeOfTree(root.leftChild) + sizeOfTree(root.rightChild); 
    }

    public void leftNodes(Node root) {

        if(root==null)
           return;

        if(root.leftChild!=null) {
           System.out.println(root.leftChild.data);
           leftNodes(root.leftChild);
        }
        else if(root.rightChild!=null)
           System.out.println(root.rightChild.data);
        }

    public void rightNodes(Node root) {

        if(root==null)
           return;
        if(root.rightChild!=null) {
            System.out.println(root.rightChild.data);
            rightNodes(root.rightChild);
        }
        else if(root.leftChild!=null) {
            System.out.println(root.leftChild.data);

        }   
    }    

    public void leftRightNodes(int data) {

          var current=root;
          while(current!=null) {

            if(current.data==data) {
                leftNodes(current);
                rightNodes(current); //we can use preorder in place both methods.
                break;
            }

            else if(current.data > data) { 
                current=current.leftChild;
            }
            else {  
                current=current.rightChild;
            }
        }

                    
    }
    public void nodeAtKDistance(Node root,int distance)  {
        if(root==null)
           return;

        if(distance==0) {
          System.out.println(root.data);
          return;
        }

        nodeAtKDistance(root.leftChild, distance-1);
        nodeAtKDistance(root.rightChild,distance-1);

    }

    public boolean twoTreesSameOrNot(Node tree1,Node tree2) {

        if(tree1==null && tree2 == null)
          return true;

        else if(tree1!=null && tree2!=null) {

            return tree1.data==tree2.data && twoTreesSameOrNot(tree1.leftChild, tree2.leftChild) && twoTreesSameOrNot(tree1.rightChild, tree2.rightChild);

        }   
        return false;
    }

    public void mirrorInsert(int data) {

        if(root==null) {
            Node node=new Node(data);
            root=node;
            return;
        }

        var current=root;

        while(true) {

            if(current.data < data) { 

                if(current.leftChild==null) {
                    current.leftChild=new Node(data);
                    break;
                }
                else {
                    current=current.leftChild;
                }

            }

            else {  

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
    
    public boolean mirrorImageSameOrNot(Node tree1,Node tree2) {

        if(tree1==null && tree2==null)
             return true;
        else if(tree1!=null && tree2!=null) {

            return tree1.data==tree2.data && twoTreesSameOrNot(tree1.leftChild, tree2.rightChild) && twoTreesSameOrNot(tree1.rightChild, tree2.leftChild);
        }     

        return false;

    }


    
}