import java.util.*;
class Vehicle{
  int speed;
  public void displaySpeed(){
    System.out.println("Vehicle class");
    System.out.println("Speed is unknown");
  }
}
class Bike extends Vehicle{
  public void readSpeed(){
    System.out.println("Bike class");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter speed:");
    this.speed = sc.nextInt();
  }
  public void displaySpeed(){
    System.out.println("Speed is"+this.speed);
  }
}
public class Main{
  public static void main(String[] args){
    Vehicle vec = new Vehicle();
    vec.displaySpeed();
    Bike rx100 = new Bike();
    rx100.readSpeed();
    rx100.displaySpeed();
  }
}
