package Q5;

import java.util.HashSet;
import java.util.Set;

public class Pmain {
    public static void main(String[] args) {
    Patient p1 = new Patient();
    Patient p2 = new Patient();
    Patient p3 = new Patient("hafsa", "Azhar", 123);
    Object o = new Patient();

    System.out.println(p1.equals(p1));
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p1.equals(o));

    Patient sara1 = new Patient("sara", "khan", 444);
    Patient sara2 = new Patient("sara", "khan", 444);

    System.out.println(sara1.equals(sara2));
    System.out.println(sara1 == sara2);

    System.out.println(sara1.hashCode());
    System.out.println(sara2.hashCode());

    Set <Patient> patients = new HashSet<>();
    patients.add(sara1);
    patients.add(sara2);
    System.out.println(patients.size());
}
}