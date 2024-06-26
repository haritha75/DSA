public class GivenTwoNumsSameOrNot {

    public static void main(String[] args) {
        

        int num1 = 10;
        int num2 = 10;

        if((num1&num2)==num1 && (num1&num2)==num2)
          System.out.println("same");
        else 
         System.out.println("not same");  
    }
}