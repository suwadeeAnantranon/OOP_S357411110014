package oop_lab7;
//SuperCar
//1.car brand
//2.car color
//3.car enging size
//4.max speed
//5.country of origin
public class SuperCar {
    private String brand;

    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", speed=" + speed +
                ", country='" + country + '\'' +
                '}';
    }//toString

    private String color;
    private String size;
    private String speed;
    private String country;
    //Constructor
    //Default Constructor
    public SuperCar(){}
    //create Constructor by owner
    public SuperCar(String brand,String color,String size,String speed,String country ){
        //assign data to class properties
        this.brand=brand;
        this.color=color;
        this.size=size;
        this.speed=speed;
        this.country=country;

    }
    //getter and setter methods


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}//class

