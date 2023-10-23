public class Main {

    public static void main(String[] args) {
        
        HashTable hash=new HashTable();
        hash.put(11, "rock");
        hash.put(8,"shock");
        hash.put(2,"mock");
        hash.put(1,"jock");

        System.out.println(hash.containsKey(11));
        System.out.println(hash.containsValue("shock"));
        System.out.println(hash.get(8));
        hash.remove(11);
        System.out.println(hash.containsKey(11));
    }
    
}
