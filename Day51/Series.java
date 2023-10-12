import java.util.ArrayDeque;
import java.util.Queue;

public class Series{

   public static void main(String args[]) {
    
      Series56Series(6);
   }

   static void Series56Series(int k) {

      Queue<String> queue=new ArrayDeque<>();
      queue.add("5");
      queue.add("6");

      for(int i=0;i<k;i++) {
         String temp=queue.remove();
         System.out.print(temp+" ");
         queue.add(temp+"5");
         queue.add(temp+"6");
      }
      

   }
}