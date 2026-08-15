public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(8,11);
        Point p2 = new Point(4,6);

        Point addition = p1.add(p2);
        Point subtraction = p1.subtract(p2);
        double distance = p1.length(p2);

        System.out.println("Addition of points is: "+addition);
        System.out.println("Subtraction of points is: "+subtraction);
        System.out.println("Distance between points is: "+distance);
        System.out.println(p1);
        System.out.println(p2);

    }
    
}
