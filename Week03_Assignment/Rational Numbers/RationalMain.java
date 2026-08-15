
public class RationalMain {
    public static void main(String[] args) {
        RationalNumbers r1 = new RationalNumbers(2, 3);
        RationalNumbers r2 = new RationalNumbers(4, 5);
        // This will throw an exception
       // RationalNumbers r3 = new RationalNumbers(1, 0); 
        RationalNumbers r4 = new RationalNumbers(0, 1); // This is valid

        RationalNumbers sum = r1.add(r2);
        RationalNumbers difference = r1.subtract(r2);
        RationalNumbers product = r1.multiply(r2);
        RationalNumbers quotient = r1.divide(r2);
        //RationalNumbers quotientByZero = r1.divide(r4); // This will throw an exception

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("Rational Number 1: " + r1);
        System.out.println("Rational Number 2: " + r2);
    }
}
