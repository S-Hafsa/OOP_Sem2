package Q5;

import java.util.Objects;
public class Patient {
    private String fname;
    private String lname;
    private int healthcardno ;

    public Patient(){
        this("unknown","unknown", -1);
    }

    public Patient(String fname, String lname, int healthcardno){
        this.fname = fname;
        this.lname = lname;
        this.healthcardno = healthcardno;
    }

    @Override 
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(this.getClass()!= obj.getClass()|| obj==null){
            return false;
        }
        Patient that = (Patient) obj;
        return this.fname == that.fname
        && this.lname == that.lname&&
        this.healthcardno==that.healthcardno;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(this.fname, this.lname,this.healthcardno);
    }

}
