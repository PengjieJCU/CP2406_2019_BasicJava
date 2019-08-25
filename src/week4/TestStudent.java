package week4;

import static org.junit.jupiter.api.Assertions.*;


class TestStudent {
    public static void main(String[] args) {
        basicTest();
        cheGPA();
        initialiser();
    }

    public static void basicTest(){
        Student student = new Student();
        student.setIdNumber(12345678);
        student.setPointsNumber(74.425);
        student.setCreditNumber(13);
        student.studentData();
    }

    public static double cheGPA(){
        Student student = new Student();
        student.setIdNumber(12345678);
        student.setPointsNumber(74.425);
        student.setCreditNumber(13);
        double gpa = student.gpa();
        return gpa;
    }

    public static void initialiser(){
        Student student3 = new Student();
        student3.gpa();
        student3.studentData();

    }
}