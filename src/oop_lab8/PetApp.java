package oop_lab8;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("DukDik",6,"Puddern");
        System.out.println(dog.toString());
        dog.makeNoise();

        cat cat = new cat("Somjook",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();

    }//main
}//class