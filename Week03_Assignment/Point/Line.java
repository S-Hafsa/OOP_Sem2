public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(){
        this.start = new Point();
        this.end = new Point();
    }

    public Line(Line obj){
        this.start = new Point(obj.start);
        this.end = new Point(obj.end);
    }

    public Point getStart() {
        return start;
    }   

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return start.length(end);
    }

    public double slope() {
        if (end.getX() == start.getX()) {
            throw new ArithmeticException("Vertical line has undefined slope");
        }
        double slope = (end.getY() - start.getY()) / (end.getX() - start.getX());
        return slope;
    }

    public Point midpoint() {
        double newX = (start.getX() + end.getX()) / 2;
        double newY = (start.getY() + end.getY()) / 2;

        return new Point(newX, newY);
    }


    public boolean isHorizontal() {
        return start.getY() == end.getY();
    }

    public boolean isVertical() {
        return start.getX() == end.getX();
    }

    @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
    }

}
