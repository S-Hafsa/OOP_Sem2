public class Amain{
    public static void main(String[] args){
        Array a1 = new Array();
        Array a2 = (Array) a1.clone();
        System.out.println("Before incrementing");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("p1: "+ a1.printPoint() );

        a1.increment();
        System.out.println("After incrementing");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
    

      


        
    }
}