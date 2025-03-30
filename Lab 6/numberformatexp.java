import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter N:");
            int n = Integer.parseInt(sc.nextLine());
            int[] nums = new int [n];
            int sum = 0;
            System.out.println("Enter the numbers: ");
            for(int i =0;i<n;i++){
                nums[i] = Integer.parseInt(sc.nextLine());
                sum=sum+nums[i];
            }
            System.out.println("Sum="+sum);
        }
        catch (NumberFormatException e){
            System.out.println("Exception: String cannot be parsed");
        }
    }
}
