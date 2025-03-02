import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a =0,total=0;
    while(true){
      System.out.println("Enter Integer");
      a=sc.nextInt();
      total = add(total,a);
      System.out.println("Current total = "+total);
    }
  }
  static int add(int total, int a){
    total = total + a;
    return total;
  }
}
