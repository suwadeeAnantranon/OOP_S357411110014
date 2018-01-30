package oop_lab8;

//Person is super-class
//Student is Sub-class

public class Student  extends Person {
    private String studentID;
    private String major;

    public Student(String personID, String name, String gender, int age, String studentID, String major) {
        //call cnontructor of super-class
        super(personID, name, gender, age);
        this.studentID = studentID;
        this.major = major;


    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}//class
