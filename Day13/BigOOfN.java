public class BigOOfN {
    public static void main(String[] args) {

    }
        
    void hello(int a[]) {

        System.out.println("hello");

        for(int i=0;i<a.length;i++) 
             System.out.println(a[i]);

        System.out.println("hi....");     

    }

    

}

/* 

 Time Complexity:

    O(1)+O(n)+O(1)

    O(2+n)

    Remove the coefficients and constants , then 

    O(n)

    */