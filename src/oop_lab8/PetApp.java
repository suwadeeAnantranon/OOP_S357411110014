package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("DukDik",6,"Puddern");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        cat cat = new cat("Somjook",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("Namjai", 5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();

    }//main
}//class