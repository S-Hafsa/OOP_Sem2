public class Cal {

    // Add any number of values
    public double add(double... numbers) {

        double total = 0;

        for (double number : numbers) {
            total += number;
        }

        return total;
    }
}