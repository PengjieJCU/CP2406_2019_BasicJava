package week4;

public class Student {
    private int idNumber;
    private double creditNumber;
    private double pointsNumber;


    public Student(){

    }

    public Student(int idNumber, double creditNumber, double pointsNumber){
        this.idNumber = 9999;
        this.creditNumber = 3;
        this.pointsNumber = 12;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(int id){
        this.idNumber = id;
    }

    public double getCreditNumber(){
        return creditNumber;
    }

    public void setCreditNumber(double credit){
        this.creditNumber = credit;
    }

    public double getPointsNumber(){
        return pointsNumber;
    }

    public void setPointsNumber(double point){
        this.pointsNumber = point;
    }

    public double gpa(){
        double mark = pointsNumber/creditNumber;
        System.out.println("You GPA is " + mark);
        return mark;
    }

    public void studentData(){
        System.out.println("Student ID: " + getIdNumber());
        System.out.println("Number of credit hours earned: " + getCreditNumber());
        System.out.println("Number of point earned: " + getPointsNumber());
    }
}
