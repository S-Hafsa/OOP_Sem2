public class Array implements Cloneable{
    private int value;
    private int[] anarray;
    private Point[] p1;
    private Triangle[] t1;

    public Array(){
        this.value =0;
        this.anarray = new int[5];
        this.p1 = new Point[5];
        for(int i = 0; i< 5; i++){
            this.anarray[i]=i;
        }
        for (int i= 0; i<5 ;i++){
            this.p1[i]= new Point(i,i);
        }
        this.t1 = new Triangle[5];
        for(int i = 0; i< t1.length;i++){
            Point x = new Point(i,i);
            Point y = new Point(i+1,i+1);
            Point z = new Point(i+2,i+2);
            this.t1[i] = new Triangle(x, y, z);
        }
    }

    @Override
    public Array clone(){
        try {
            Array copy = (Array) super.clone();
            copy.p1 = new Point[p1.length];
            for(int i = 0; i< anarray.length ; i++){
                copy.p1[i] = new Point(p1[i].getX(), p1[i].getY());
            }

            copy.anarray = new int[anarray.length];
            for(int i = 0; i< anarray.length ; i++){
                copy.anarray[i] = anarray[i];
            }
            copy.t1 = new Triangle[t1.length];
            for(int i = 0; i<t1.length ; i++){
                copy.t1[i] = this.t1[i].clone();
            }

            return copy ;
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
        return null;
    }

    public void increment(){
        this.value++;
        this.anarray[0]++;
        this.p1[0].incrementX();
        this.p1[0].incrementY();
        this.t1[0].incrementA();

    }

    public Point printPoint(){
        System.out.println(p1[0]);
        return p1[2];
    }

    @Override 
    public String toString(){
        String array = "";
         for(int i = 0; i<anarray.length; i++){
            array+= anarray[i]+ " ";
        }
        array = "( "+ array+")";
        
        return "Value: " + this.value + " \n Array: " + 
        array + "\nPoint : "+ java.util.Arrays.toString(this.p1) + "\n Triangle: " + java.util.Arrays.toString(t1);
    }
}