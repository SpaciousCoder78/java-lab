import java.util.Scanner;
import java.util.stream.StreamSupport;

class BasicInfo{
    String name;
    int roll;
    int age;
    Scanner sc = new Scanner(System.in);
    void read1(){
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter roll");
        roll = sc.nextInt();
        System.out.println("Enter age: ");
        age = sc.nextInt();

    }
    void dispbasicinfo(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Age:"+age);
    }

}
interface Academic{
    void display();
}

class Financial extends BasicInfo implements Academic{
    Scanner sc= new Scanner(System.in);
    String course;int semester;
    public void display(){
        System.out.println("Enter course: ");
        course = sc.next();
        System.out.println("Enter sem: ");
        semester=sc.nextInt();
        System.out.println("Course: "+ course);
        System.out.println("Sem: "+semester);
    }
    @Override
    void read1(){
        super.read1();
    }
    @Override
    void dispbasicinfo(){
        super.dispbasicinfo();
    }
    public static void main(String[] args){
        Financial fin = new Financial();
        fin.dispbasicinfo();
        fin.read1();
        fin.dispbasicinfo();
    }
}
