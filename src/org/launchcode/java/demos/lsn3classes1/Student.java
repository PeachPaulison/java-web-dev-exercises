package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;




    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    protected void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }



}