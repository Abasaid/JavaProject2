package org.example;
//11. Create an Interface 'Shape' with undefined methods as calculateArea and
//calculatePerimeter. Create 2 classes Circle & Square that implements
//functionality defined in the Shape Interface. Test your code.
interface shape{
    double calculateArea(double num);
    double calculatePerimeter(double num);
}
class Circle implements shape{
    @Override
    public double calculateArea(double num) {
        return 3.14*num*num;
    }

    @Override
    public double calculatePerimeter(double num) {
        return 2*num*3.14;
    }
}
class Square implements shape{
    @Override
    public double calculateArea(double num) {
        return num*num;
    }

    @Override
    public double calculatePerimeter(double num) {
        return 4*num;
    }
}
public class Code11 {
    public static void main(String[] args) {
    Square s=new Square();
        System.out.println(s.calculatePerimeter(15));
    }
}
