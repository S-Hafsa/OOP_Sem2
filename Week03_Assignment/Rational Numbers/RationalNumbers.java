public class RationalNumbers {
    private int numerator;
    private int denominator;

    public RationalNumbers() {
        this.numerator = 0;
        this.denominator = 1; // Default denominator to 1 to avoid division by zero
    }

    public RationalNumbers(int numerator, int denominator) {
    if (denominator == 0) {
        throw new IllegalArgumentException("Denominator cannot be zero");
    }

    this.numerator = numerator;
    this.denominator = denominator;
}

    public RationalNumbers(RationalNumbers obj) {
        this.numerator = obj.numerator;
        this.denominator = obj.denominator;
    }

        public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public RationalNumbers add(RationalNumbers obj) {
        int newNumerator = (this.numerator * obj.denominator) + (obj.numerator * this.denominator);
        int newDenominator = this.denominator * obj.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers subtract(RationalNumbers obj) {
        int newNumerator = (this.numerator * obj.denominator) - (obj.numerator * this.denominator);
        int newDenominator = this.denominator * obj.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers multiply(RationalNumbers obj) {
        int newNumerator = this.numerator * obj.numerator;
        int newDenominator = this.denominator * obj.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    public RationalNumbers divide(RationalNumbers other) {
    if (other.numerator == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumbers(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
