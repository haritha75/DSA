import java.util.Scanner;

class Fraction {

    void add(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {

        int Numerator = numeratorA * denominatorB + numeratorB * denominatorA;
        int Denominator = denominatorA * denominatorB;
        System.out.println("Adding: " + Numerator + "/" + Denominator);
    }

    void subtract(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {

        int Numerator = numeratorA * denominatorB - numeratorB * denominatorA;
        int Denominator = denominatorA * denominatorB;
        System.out.println("Substraction: " + Numerator + "/" + Denominator);
    }

    void multiply(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {

        if(numeratorA==0||numeratorB==0) {
            System.out.println("Multiplication: "+0);
        }
        else if(denominatorA==0||denominatorB==0) {
            System.out.println("Multiplication: infinity");
        }
       
        else if(numeratorA!=0||denominatorA!=0||numeratorB!=0||numeratorB!=0) {

            int Numerator = numeratorA * numeratorB;
            int Denominator = denominatorA * denominatorB;
            System.out.println("Multiplication: " + Numerator + "/" + Denominator);
        }
      
    }

    void divide(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {

         if(numeratorA==0||denominatorB==0) {
            System.out.println("division :"+0);
         }
         else if(denominatorA==0||numeratorB==0) {
            System.out.println("division :infinity");
         }

         else if(numeratorA!=0||denominatorA!=0||numeratorB!=0||numeratorB!=0) {

            int Numerator = numeratorA * denominatorB;
            int Denominator = denominatorA * numeratorB;
            System.out.println("divison: " + Numerator + "/" + Denominator);
         }
        
        
    }
}

public class FractionEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator of fraction a: ");
        int numeratorA = sc.nextInt();
        System.out.print("Enter the denominator of fraction a: ");
        int denominatorA = sc.nextInt();

        System.out.print("Enter the numerator of fraction b: ");
        int numeratorB = sc.nextInt();
        System.out.print("Enter the denominator of fraction b: ");
        int denominatorB = sc.nextInt();

        Fraction fraction = new Fraction();

        fraction.add(numeratorA, denominatorA, numeratorB, denominatorB);
        fraction.subtract(numeratorA, denominatorA, numeratorB, denominatorB);
        fraction.multiply(numeratorA, denominatorA, numeratorB, denominatorB);
        fraction.divide(numeratorA, denominatorA, numeratorB, denominatorB);

    }
}