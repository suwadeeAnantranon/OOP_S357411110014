package oop_lab8;

public class PersonInfo {
    public static void main (String [] args){
        Student student = new Student("1236548855","suwadee","Male",22,"54545654215645","IS:Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());

        Employee employee = new Employee("125445","suwadee","Male",22,"1234","marketing",5000);

        System.out.println(employee.toString());


    }//main


}//class
