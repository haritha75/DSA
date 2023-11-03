public class TreeMain {

    public static void main(String[] args) {
        
        BTOrBTS bts=new BTOrBTS();

        bts.insert(44);
        bts.insert(77);
        bts.insert(45);
        bts.insert(33);
        bts.insert(34);
        bts.insert(23);
        bts.insert(36);
        bts.insert(21);

        System.out.println(bts.find(33));
        System.out.println(bts.find(11));
    }
    
}
