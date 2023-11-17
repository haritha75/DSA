class Node {

        int data;

        public Node(int data) {
            this.data=data;
        }

        Node leftChild;
        Node rightChild;

        @Override
        public String toString() {
            return Integer.toString(data);
        }

    }
public class Tree {

   
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
    public void levelOrderTraverse(Node root) {

        var height=height(root);
        for(int i=0;i<=height;i++) {

            nodeAtKDistance(root, i);
        }

    }

    public boolean isBST(Node root,int minValue,int maxValue) {

        if(root==null)
           return true;
        if(root.data< minValue || root.data>maxValue)   
           return false;

        return isBST(root.leftChild, minValue, root.data-1) && isBST(root.rightChild, root.data+1, maxValue) ;  


    }

    public boolean contains(Node root,int data) {
        if(root==null)
          return false;
        if(root.data==data)
          return true;
        return contains(root.leftChild, data) || contains(root.rightChild, data);
    }

    public void printOneChild(Node root) {

        if(root==null)
          return;
        else if(root.leftChild !=null && root.rightChild !=null) {

            printOneChild(root.leftChild);
            printOneChild(root.rightChild);
        }  
        else if(root.rightChild!=null)
          System.out.println(root.rightChild.data);
        else if(root.leftChild!=null)
          System.out.println(root.leftChild.data);  
    }

    public void binaryNode(Node root) {

        if(root == null)
          return;

        else if(root.leftChild !=null && root.rightChild !=null)   {
            System.out.println(root);
            binaryNode(root.leftChild);
            binaryNode(root.rightChild);
        }
    }

    public boolean isFullBT(Node root) {

        if(root == null)
          return true;

          else if(root.leftChild ==null && root.rightChild == null) {
            return true;
        }
        else if(root.leftChild!=null && root.rightChild!=null) 
           return isFullBT(root.leftChild) && isFullBT(root.rightChild);

        return false;   

    }
    int count=0;
    public void nodeAtKDistance1(Node root,int distance)  {
        if(root==null)
           return;

        if(distance==0) {
            count++;
           
        }

        nodeAtKDistance1(root.leftChild, distance-1);
        nodeAtKDistance1(root.rightChild,distance-1);

    }
    public void levelOrderTraverse1(Node root) {

        var height=height(root);
        for(int i=0;i<height;i++) {

            nodeAtKDistance1(root, i);
        }

    }



    public boolean isPerfectBT(Node root) {

        if(root==null)
          return true;;

        levelOrderTraverse1(root);
        

        int h=height(root);
        int previous=0;
        for(int i=1;i<=h;i++) {
           previous = previous+(previous+1);
           
        }

        return count==previous && isFullBT(root);         
        

    }
    public boolean complete(Node root) {

        if(root==null)
          return true;

        while(root.leftChild!=null || (root.rightChild!=null && root.leftChild !=null)) {
            
            return complete(root.leftChild);
        }
        if(root.leftChild==null && root.rightChild==null)
           return true;
        return false;
        

    }
    public boolean completeBT(Node root) {

        if(root==null)
           return true;
          
        return isFullBT(root.leftChild) && complete(root.rightChild);

    }
    private Node findNode(int data) {

        var current=root;

        while(current!=null) {
            if(data> current.data)
              current=current.rightChild;
            else if(data<current.data)
               current=current.leftChild;
            else
              return current;     

        }
        return null;
    }
    public void printLeftAndRight(int data) {
        Node curr=findNode(data);

        if(curr!=null) {
            if(curr.leftChild!=null)
              System.out.print("leftchild "+curr.leftChild.data+" ");
            if(curr.rightChild!=null)
              System.out.println("rightchild "+curr.rightChild.data);  
        }
        else 
         System.out.println("their is no such element");  


    }
    
}