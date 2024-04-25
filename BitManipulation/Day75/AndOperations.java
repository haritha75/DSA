// if you want off the particular bit then use bitwise and operator
public class AndOperations {
    
    public static void main(String[] args) {
        

        int num =10; // 0 0 0 0 1 0 1 0
                     // 1 1 1 1 0 1 1 1
                     //------------------
                     // 0 0 0 0 0 0 1 0 -- see here 3rd position will be off.   



        int i =3;
        int mask = ~(1<<i);

        System.out.println(num&mask);
    }
}
