import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    void SetFraction(int numerator, int denominator) {

        this.numerator = numerator;

        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
    }

    void add(Fraction other) {

        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        System.out.println("Addition: " + newNumerator + "/" + newDenominator);
    }

    void subtract(Fraction other) {

        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        System.out.println("Subtraction: " + newNumerator + "/" + newDenominator);
    }

    void Mul(Fraction other) {

        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        System.out.println("Multification: " + newNumerator + "/" + newDenominator);
    }
    void div(Fraction other) {

        if(other.numerator !=0) {

            int newNumerator = this.numerator * other.denominator;
            int newDenominator = this.denominator * other.numerator;
            System.out.println("Division: " + newNumerator + "/" + newDenominator);
            
        }

        else {

            System.out.println("cannot divide by zero");
        }
    }
    
}

public class Fractions {
    public static void main(String[] args) {
        Fraction fractionA= new Fraction();
        Fraction fractionB= new Fraction();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator of fraction a: ");
        int numeratorA = sc.nextInt();
        System.out.print("Enter the denominator of fraction a: ");
        int denominatorA = sc.nextInt();
        fractionA.SetFraction(numeratorA,denominatorA);

        System.out.print("Enter the numerator of fraction b: ");
        int numeratorB = sc.nextInt();
        System.out.print("Enter the denominator of fraction b: ");
        int denominatorB = sc.nextInt();
        fractionB.SetFraction(numeratorB,denominatorB);


        fractionA.add(fractionB);
        fractionA.subtract(fractionB);
        fractionA.Mul(fractionB);
        fractionA.div(fractionB);

        
    }
}