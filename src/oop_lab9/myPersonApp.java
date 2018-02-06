package oop_lab9;

public class myPersonApp {
    public static void main(String[] args) {

        Address address = new Address("1234","Trang","92000");

        Job job = new Job("พนักงานการเงิน",10000);

        Person person = new Person ("123","sai",address,job);
        System.out.println(person.toString());

        person.getJob().setSalary(25000);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());










    }//main
}//class