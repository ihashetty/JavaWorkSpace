public class Car{
    String color;
    String model;
    int chassisNo;
    double price;

    public Car(String color){

        this.color = color;
    }
    public void displayDetails(){
        System.out.println("Color: " + color);

    } 
}