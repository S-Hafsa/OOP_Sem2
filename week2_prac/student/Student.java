import java.util.Scanner;

public class Student{
    private String name;
    private int score1;
    private int score2;



public Student (String name) {
    this.name = name;
}

public void printName(){
    System.out.println(name);
}

public void inputGrades()
{
    Scanner in = new Scanner(System.in);
    System.err.println("Enter grades for test 1: ");
    score1 = in.nextInt();
    System.err.println("Enter grades for test 2: ");
    score2 = in.nextInt();

}

public double getAverage(){
    return (double)(score1+score2)/2;
}

public String getName(){
    return name;
}


public String toString(){
    return "Name: " + name + "test 1: "+score1;
}

}