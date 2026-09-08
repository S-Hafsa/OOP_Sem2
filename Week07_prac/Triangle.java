public class Triangle {
    protected Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    public Triangle(Point a , Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Triangle(double x , double y, double a, double b, double m, double n){
        this.a = new Point(x,y);
        this.b = new Point (a,b);
        this.c = new Point (m,n);
    }

    /*public Triangle(Triangle obj){
        Triangle tri = new Triangle(obj);
    }*/

    public Point getA(){
        return this.a;
    }

    public Point getB(){
        return this.b;
    }

    public Point getC(){
        return this.c;
    }

    public void incrementA(){
        a.incrementX();
        a.incrementY();
    }
    
    @Override 
    public Triangle clone()throws CloneNotSupportedException{
        Triangle copy = new Triangle();
        copy.a = this.a.clone();
        copy.b= this.b.clone();
        copy.c = this.c.clone();
        return copy;
    }

    @Override public String toString(){
        return "a[ "+a.getX()+" ,"+a.getY()+"], b: ["+b.getX()+" , "+b.getY()+" ], c: ["+ c.getX() + " , "+c.getY()+" ]";
    }
}
