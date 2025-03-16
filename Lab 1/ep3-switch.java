import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int choice;
        int a = 30, b = 10;
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Enter your choice: ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    int sum = a+b;
                    System.out.println("Addition ="+sum);
                    break;
                case 2:
                    int sub = a-b;
                    System.out.println("Subtraction ="+sub);
                    break;
                case 3:
                    int mul = a*b;
                    System.out.println("Multiplication="+mul);
                    break;
                case 4:
                    int div = a/b;
                    System.out.println("Division="+div);
                    break;
            }
        }
    }
}
