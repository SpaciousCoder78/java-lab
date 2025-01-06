//2d array

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i ,j;
        System.out.println("Enter no of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter no of cols: ");
        int cols = sc.nextInt();

        int [][] arr = new int [rows] [cols];
        System.out.println("Enter the matrix: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.println("Enter Element:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.println(arr[i][j]+"\t");
            }
        }
        
    }
}
