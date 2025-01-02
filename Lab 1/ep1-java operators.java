//write a program to demonstrate different operators in java
public class Main{
  public static void main(String[] args){
    int a = 30,b=10;
    int sum = a+b;
    System.out.println("Addition ="+ sum);
    int diff = a-b;
    System.out.println("Subtraction = "+ diff);
    int mul = a*b;
    System.out.println("Multiplication = "+ mul);
    int div = a/b;
    System.out.println("Division = "+ div);
    int mod = a%b;
    System.out.println("Modulus = " + a%b);
    int incre = a++;
    System.out.println("Increment of a = " + incre);
    int decre = a--;
    System.out.println("Decrement of a = " + decre);
  }
}
