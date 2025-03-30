import java.util.Scanner;

interface Item{
    void readDimensions();
    void displayDimensions();
}
interface Shape extends Item{
    @Override
    void readDimensions();
    @Override
    void displayDimensions();
}
class Cylinder implements Shape{
    Scanner sc = new Scanner(System.in);
    int rad,ht;
    public void readDimensions(){
        System.out.println("Enter radius: ");
        rad = sc.nextInt();
        System.out.println("Enter height: ");
        ht = sc.nextInt();
    }
    public void displayDimensions(){
        System.out.println("Radius: "+rad);
        System.out.println("Height: "+ht);
    }
    public static void main(String[] args){
        Cylinder cyl = new Cylinder();
        cyl.readDimensions();
        cyl.displayDimensions();
    }
}
