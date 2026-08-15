public class Triangle{
    TriPoint p1;
    TriPoint p2;
    TriPoint p3;
    static int count = 0;

    //null constructor
    public Triangle(){
        this.p1 = new TriPoint();
        this.p2 = new TriPoint();
        this.p3 = new TriPoint();
        count++;
    }
    //parameterized constructor with 3 points
    public Triangle (TriPoint a, TriPoint b, TriPoint c){
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
        count++;
    }
    //copy constructor
    public Triangle ( Triangle obj){
        this.p1 = obj.p1;
        this.p2 = obj.p2;
        this.p3 = obj.p3;
        count++;
    }
    //parameterized constructor with 6 coordinates
    public Triangle ( double x1 , double y1, double x2, double y2, double x3, double y3){
        this.p1 = new TriPoint( x1 , y1);
        this.p2 = new TriPoint( x2 , y2);
        this.p3 = new TriPoint( x3 , y3);
        count++;
    }

    static int getCount(){
        return count;
    }

    public void setP1(TriPoint p1){
        this.p1 = p1;
    }

    public void setP2(TriPoint p2){
        this.p2 = p2;
    }

     public void setP3(TriPoint p3){
        this.p3 = p3;
    }

    public TriPoint getP1(){
        return this.p1;
    }

    public TriPoint getP2(){
        return this.p2;
    }

    public TriPoint getP3(){
        return this.p3;
    }

    public double getPerimeter(){
        double sideA = p1.getDistance(p2);
        double sideB = p2.getDistance(p3);
        double sideC = p1.getDistance(p3);
        return sideA + sideB + sideC;
    }

    public boolean isRightAngled(){
        double sideA = p1.getDistance(p2);
        double sideB = p2.getDistance(p3);
        double sideC = p1.getDistance(p3);
        return (sideA*sideA + sideB*sideB == sideC*sideC) || 
        (sideA*sideA + sideC*sideC == sideB*sideB) || 
        (sideB*sideB + sideC*sideC == sideA*sideA);
        
    }

    @Override
    public String toString(){
        return "Triangle: Point 1: (" + p1.getX() + ", " + p1.getY() + "), Point 2: (" + p2.getX() + ", " + p2.getY() + "), Point 3: (" + p3.getX() + ", " + p3.getY() + ")";
    }

}