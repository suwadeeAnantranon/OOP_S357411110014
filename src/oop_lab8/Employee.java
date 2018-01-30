package oop_lab8;

public class Employee extends Person {
    private String EmployeeID;
    private String Position;
    private int Salary;

    public Employee(String personID, String name, String gender, int age, String employeeID, String position, int salary) {
        super(personID, name, gender, age);
        EmployeeID = employeeID;
        Position = position;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID='" + EmployeeID + '\'' +
                ", Position='" + Position + '\'' +
                ", Salary=" + Salary +
                "} " + super.toString();
    }


    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}//class
