package day23encapsulationabstraction;

public class Student {

    public String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    private String disease = "Heart Disease";
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }
    public double getStdGpa() {
        return stdGpa;
    }
    public String getDisease(){
        return disease;
    }
    //If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGpa(double gpa){
        this.stdGpa = gpa;
    }
    //Even the data type is boolean we use "set" at the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}


