public class TriPoint {
    protected double x;
    protected double y;

    public TriPoint(){
        this.x = 0;
        this.y = 0 ;
    }

    public TriPoint(double x, double y){
        this.x = x;
        this.y = y;
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

     public double getDistance(TriPoint obj){
        return Math.sqrt(
        Math.pow((obj.x - this.x),2)
        + Math.pow((obj.y - this.y), 2));
   }

}
