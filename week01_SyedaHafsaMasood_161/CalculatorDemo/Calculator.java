public class Calculator {
    //attributes
    private double a;
    private double b;
    
    //null constructor
    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    //parameterized constructor
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //setter method
    public void setValues(double a, double b) {
        this.a = a;
        this.b = b;
    }

        //getter methods
    public double getB() {
        return b;
    }


    public double getA() {
        return a;
    }


    //methods for basic operations
    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    public double divide() {
        if (this.b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return this.a / this.b;
    }

    // New Operations

    public double modulus() {
        if( this.b == 0) {
            System.out.println("Modulus by zero is not allowed.");
            return 0;
        }
        return this.a % this.b;
    }

    public double power() {
        return Math.pow(this.a, this.b);
    }

    //varrags method to calculate average of numbers
    public static double average(double... numbers) {
    if (numbers.length == 0) { 
        System.out.println("No numbers provided.");
        return 0;
    }

    double sum = 0;

    for (double n : numbers)
        sum += n;

    return sum / numbers.length;
}


}