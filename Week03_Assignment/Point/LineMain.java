public class LineMain {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        Line line1 = new Line(p1, p2);

        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Slope of Line 1: " + line1.slope());
        System.out.println("Midpoint of Line 1: " + line1.midpoint());
        System.out.println("Is Line 1 horizontal? " + line1.isHorizontal());
        System.out.println("Is Line 1 vertical? " + line1.isVertical());

        // Create a vertical line
        Point p3 = new Point(4, 2);
        Point p4 = new Point(4, 6);
        Line line2 = new Line(p3, p4);

        System.out.println("\nLine 2: " + line2);
        System.out.println("Length of Line 2: " + line2.getLength());
        try {
            System.out.println("Slope of Line 2: " + line2.slope());
        } catch (ArithmeticException e) {
            System.out.println("Slope of Line 2: " + e.getMessage());
        }
        System.out.println("Midpoint of Line 2: " + line2.midpoint());
        System.out.println("Is Line 2 horizontal? " + line2.isHorizontal());
        System.out.println("Is Line 2 vertical? " + line2.isVertical());
    }
    
}
