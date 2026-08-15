public class Triangle {
    private double a;
    private double b; 
    private double c;
    static int count=0;

    public Triangle(){
        this.a=1.0;
        this.b=1.0;
        this.c=1.0;
        count++;
    }

    public Triangle(double a){
        this.a = a;
        count++;
    }

    public Triangle( double a,double b)
    {
        this.a = a;
         this.b = b;
         count++;
    }

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b= b; 
        this.c = c;
        count++;
    }

    public Triangle(Triangle t){
        a = t.a;
        b = t.b;
        c = t.c;
        count++;
    }

    public static int objectCount(){
        return count;
    }

    public double perimeter(){
        return a+b+c;
    }

    public boolean isRightAngled(int angle){
        if(angle == 90){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Sides a:"+a+" Side b: "+b+" Side c: "+c;
    }
}
