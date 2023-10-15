import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        map.put(1, "haritha");
        map.put(2,"reddi");
        map.put(3,"ramya");
        map.put(4,"hari");
        map.put(5,"raj");
        map.put(4,"bhargav"); //in 4  replace with bhargav
        map.put(null,"reddi"); //it allows duplicates values but not keys and also allows keys as a null 
        map.put(null,"junnu");

        System.out.println(map);
        map.remove(4);
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("raj"));
        System.out.println(map.get(null));
        System.out.println(map.get(1)); //get methods return the value


        for( var x: map.keySet()) {
            System.out.println(x);
        }
         for( var x: map.values()) {
            System.out.println(x);
        }

         for( var x: map.entrySet()) {
            System.out.println(x);
        }

         for( var x: map.entrySet()) {
            System.out.println(x.getKey()+": "+x.getValue());
        }




       

    }
}