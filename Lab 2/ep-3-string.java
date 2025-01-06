//string ops

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       String s,s1="";
       System.out.println("Enter a string");
       Scanner sc = new Scanner(System.in);
       s = sc.next();
       int stlen = s.replaceAll("[aeiou]","").length();
       s1 = s.replaceAll("[aeiou]","");
       System.out.println("The length of string without vowels = "+stlen);
       System.out.println("The string without vowels is"+s1);
    }
}
