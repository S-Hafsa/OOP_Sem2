public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex obj){
        this.real = obj.real;
        this.imaginary = obj.imaginary;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex obj){
        double newReal = this.real +obj.real;
        double newImaginary = this.imaginary + obj.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex obj){
        double newReal = this.real - obj.real;
        double newImaginary = this.imaginary - obj.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex obj){
        double newReal = this.real * obj.real - this.imaginary * obj.imaginary;
        double newImaginary = this.real * obj.imaginary + this.imaginary * obj.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
    if (other.real == 0 && other.imaginary == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }

    double denominator = other.real * other.real + other.imaginary * other.imaginary;
    double newReal =(this.real * other.real + this.imaginary * other.imaginary) / denominator;
    double newImaginary = (this.imaginary * other.real -this.real * other.imaginary) / denominator;

    return new Complex(newReal, newImaginary);
}

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
