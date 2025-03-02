import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args){
    String s = " ";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string: ");
    s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s);
    String revstr=" ";
    while(st.hasMoreTokens()){
      revstr=st.nextToken()+" "+revstr;
    }
    System.out.println("Original String: "+s);
    System.out.println("Reversed String: "=revstr);
  }
}
