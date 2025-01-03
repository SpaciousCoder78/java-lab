//write a program to demonstrate control structures
import java.util.scanner;

public class Main{
  public static void main(String[] args){
    int a,b;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a: ");
    a = scan.nextInt();
    System.out.println("Enter b: ");
    if (a<10&&b<10){
      System.out.println("a and b are less than 10");
    }else{
      System.out.println("a and b are greater than 10");
    }
    else if(a>30 && b>30){
      System.out.println("a and b are greater than 30");
    }
  }
}
