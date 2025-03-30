import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter N: ");
            int n = sc.nextInt();
            int [] nums = new int[n];
            int sum=0;
            System.out.println("Enter the numbers: ");
            for(int i=0;i<n;i++) {
                nums[i] = sc.nextInt();
                if (nums[i] == 0 || nums[i] < 0) {
                    throw new ArithmeticException();
                }
                sum = sum + nums[i];
            }
            int avg = sum/n;
            System.out.println("Average: "+avg);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: You entered 0 or negative number");
        }
    }
}
