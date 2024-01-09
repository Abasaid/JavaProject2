package org.example;

import java.util.Map;

//12. We have to calculate the average of marks obtained in three subjects by
//student A and by student B. Create class 'Marks' with an abstract method
//'getPercentage' that will return the average percentage of marks. Provide
//implementation of abstract methods in classes 'A' and 'B'. The constructor of
//student A takes the marks in three subjects as its parameters and the marks
//in four subjects as its parameters for student B. Test your code
abstract class Marks{
    abstract double getPercentage();

}
class StudentA extends Marks{
    private double bioMarks;
    private double mathMarks;
    private double chemMarks;

    public StudentA(double bioMarks, double mathMarks, double chemMarks) {
        this.bioMarks = bioMarks;
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
    }

    @Override
    double getPercentage() {
        double totalA=(bioMarks+mathMarks+chemMarks)/3;
        return totalA;
    }
}
class StudentB extends Marks{
    private double bioMarks;
    private double mathMarks;
    private double chemMarks;
    private double engMarks;

    public StudentB(double bioMarks, double mathMarks, double chemMarks, double engMarks) {
        this.bioMarks = bioMarks;
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
        this.engMarks = engMarks;
    }

    @Override
    double getPercentage() {
        double totalB=(bioMarks+mathMarks+chemMarks+engMarks)/4;
        return totalB;
    }
}
public class Code12 {
    public static void main(String[] args) {
        StudentA s=new StudentA(70,50,30);
        System.out.println(s.getPercentage());
    }

}
