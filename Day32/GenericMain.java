public class GenericMain {

    public static void main(String[] args) {
        GenericStack<Character> s= new GenericStack<>(5);
        s.push('a');
        s.push('g');
        s.push(6);

        System.out.println(s);
    }
    
}
