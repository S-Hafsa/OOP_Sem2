public class Point {
    protected double x;
    protected double y;

    public Point(){
        this.x = 0;
        this.y = 0 ;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point (Point obj){
        this.x = obj.x;
        this.y = obj.y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

   public Point add(Point obj){
        double newX = this.x + obj.x;
        double newY = this.y + obj.y;
        return new Point(newX, newY);
   }

   public Point subtract(Point obj){
        double newX = this.x - obj.x;
        double newY = this.y - obj.y;
        return new Point(newX, newY);
   }

   public double length(Point obj){
        double length = Math.sqrt(Math.pow((obj.x - this.x),2) + Math.pow((obj.y - this.y), 2));
        return length;
   }

   @Override
   public String toString(){
        return "(" + this.x + ", " + this.y + ")";
   }

}
