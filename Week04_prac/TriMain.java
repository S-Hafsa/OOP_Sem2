public class TriMain {
    public static void main(String [] agrs){
        Triangle t1 = new Triangle();
        System.out.println("Perimeter of t1: " + t1.getPerimeter());
        
        TriPoint a = new TriPoint(1, 2);
        TriPoint b = new TriPoint(2,4);
        TriPoint c = new TriPoint(5,1);

        Triangle t2 = new Triangle(a, b, c);
        System.out.println("Perimeter of t2: " + t2.getPerimeter());
        System.out.println("Is t2 right-angled? " + t2.isRightAngled());

        Triangle t3 = new Triangle(new TriPoint(0, 0), new TriPoint(3, 0), new TriPoint(0, 4));
        System.out.println("Perimeter of t3: " + t3.getPerimeter());
        System.out.println("Is t3 right-angled? " + t3.isRightAngled());
        System.out.println("t3: " + t3);
        System.out.println("Total triangles created: " + Triangle.getCount());
    }
    
}
