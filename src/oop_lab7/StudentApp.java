package oop_lab7;

public class StudentApp {
    public static void main (String[] args){
        //create Opjects as Student
        Student student1 = new Student();

        student1.setID("111111111111");
        student1.getMajor("Information System");
        student1.getFaculty("Management Tecchnology");
        student1.getName("Boy Saiyai");

        System.out.println(student1.toString());

        Student student2 = new Student("222222222222","Management","Business Management","Girl Songkhla");

        System.out.println(student2.toString());


    }//main
}//class
