public class Main{
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        System.out.println(t1.perimeter());
        System.out.println(t1.isRightAngled(90));

        Triangle t2 = new Triangle(2.2,3.4,5.8);
        System.out.println(t2);
        System.out.println(t2.perimeter());
        System.out.println(t2.isRightAngled(30));

        System.err.println(t1.objectCount());

        Triangle t3 = new Triangle(t2);
        System.out.println(t3);

        System.err.println(t1.objectCount());
    }
}