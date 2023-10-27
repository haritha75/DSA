public class Main {

    public static void main(String[] args) {
        

        LinearProbing lp = new LinearProbing();
        lp.put(0,"haritha");
        lp.put(2,"rocky");
        lp.put(11,"reddy");
        lp.put(12,"junnu");
        System.out.println(lp.containsKey(2));
        System.out.println(lp.containsValue("junnu"));
        lp.remove(2);
        System.out.println(lp.containsKey(2));
        System.out.println(lp.get(0));


    }
    
}
