//EP1: develop a java program to demonstrate arithmetic exception

import java.util.Scanner;
class ArithmeticExcept{
    public static void main(String[] args){
        int a,b,c;
        try{
            System.out.println("Enter a: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("Enter b: ");
            b = sc.nextInt();
            c=a/b;
            System.out.println("Div ="+c);
        }
        catch (ArithmeticException e){
            System.out.println("Cant divide a number by 0");
        }
    }
}
