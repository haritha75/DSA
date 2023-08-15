public class BigOfNCube {

    public static void main(String[] args) {
        
    }

    void hi(int a[]) {

        for(int i=0;i<a.length;i++) 
          for(int k=0;k<a.length;k++)
            for(int l=0;l<a.length;l++)
             System.out.println("hello......");

    }
    
}

/* 
 here, three for loop iterate n times then

 o(n)*o(n)*O(n)

 O(n*n*n)
 
 O(n^3) is the time complexity

 */