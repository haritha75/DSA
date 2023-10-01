public class AnnonymousInnerClass {

    public static void main(String[] args) {

        Animal a = new Animal() { 

           
           public  void eat() {
                System.out.println("eating.....");
                
            }

        };
        a.eat();
    
        
    }
    
}
interface Animal {

    void eat();
}