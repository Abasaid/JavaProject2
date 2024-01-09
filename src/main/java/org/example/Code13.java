package org.example;
//13. Create a Class Car that would have the following fields: carPrice and color
//and method calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
//and has its own implementation of calculateSalePrice() method in which
//returned price is calculated as following: if weight>2000 then returned price
//car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation
//of calculateSalePrice(): if length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount
abstract class Car{
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice(double carPrice);
}
class Sedan extends Car{
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice(double carPrice) {
        double discount;
        if (length>20){
            discount=carPrice*0.05;
        }else{
            discount=carPrice*0.10;
        }
        return discount;
    }
}
class Truck extends Car{
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice(double carPrice) {
        double discount;
        if (weight>2000){
            discount=carPrice*0.10;
        }else{
            discount=carPrice*0.20;
        }
        return discount;
    }
}
public class Code13 {
    public static void main(String[] args) {
        Sedan s=new Sedan(100,"Blue",2);
        System.out.println(s.calculateSalePrice(90));
    }
}
