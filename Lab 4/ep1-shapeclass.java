import java.util.Scanner;
class Shape2D{
  int len,bred;
  public void read(){
    System.out.println("Shape Class");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    len = sc.nextInt();
    System.out.println("Enter breadth: ");
    bred = sc.nextInt();
  }
  public void disp(){
    System.out.println("Length="+len+", Breadth="+bred);
    System.out.println("Area is not defined");
  }
}

class Rectangle extends Shape2D{
  public void read(){
    System.out.println("Rectangle class");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    this.len = sc.nextInt();
    System.out.println("Enter breadth: ");
    this.bred = sc.nextInt();
  }
  public void disp(){
    System.out.println("Length="+this.len+", breadth = "+this.bred);
    System.out.println("Area is"+this.len*this.bred);
  }
}

public class Main{
  public static void main(String[] args){
    Shape2D shape = new Shape2D();
    shape.read();
    shape.disp();
    Rectangle rect = new Rectangle();
    rect.read();
    rect.disp();
  }
}
