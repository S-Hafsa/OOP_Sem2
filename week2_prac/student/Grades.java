public class Grades{
    public static void main(String [] args){
        Student niya= new Student("Haniya");
        niya.inputGrades();
        System.out.println("Average of "+ niya.getName()+" is: "+ niya.getAverage());
        System.out.println(niya);
    }
}