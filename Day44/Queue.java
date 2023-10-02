import java.util.ArrayDeque;

public class Queue {
    public static void main(String args[]){
        ArrayDeque<Integer> que=new ArrayDeque<>();
        que.add(12);
        que.add(38);
        que.add(70);
        que.add(18);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que);
    }
}
    

