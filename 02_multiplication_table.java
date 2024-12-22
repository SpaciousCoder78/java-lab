//multiplication table

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int count = 10;
        for(int i =0;i<=count;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
