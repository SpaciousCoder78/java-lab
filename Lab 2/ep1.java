import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int[] num = new int[30];
    int n;
    System.out.println("Enter no of elements in array");
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    System.out.println("Enter the array elements: ");
    for(int i = 0;i<n;i++){
        num[i] = scan.nextInt();
    }
    System.out.println("Array elements are: ");
    for(int i =0;i<n;i++){
      System.out.println(num[i]+" ");
    }
    int sum =0;
    for(int i=0;i<n;i++){
      sum+=num[i];
    }
    System.out.println("\n Sum of array elements is "+sum);
  }
}
