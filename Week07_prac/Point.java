public class Point implements Cloneable {
    protected double x;
    protected double y;

    public Point(){
        this.x = 0;
         this.y =0;

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void incrementX(){
        this.x++;
    }
    public void incrementY(){
        this.y++;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override 
    public String toString(){
        return "[ " +x+" , "+y+" ]";

    }
    
    @Override 
    public Point clone()throws CloneNotSupportedException{
        
        Point copy = new Point(this.x, this.y);
        return copy;
    }
}
