interface Shape{
    void printArea();
    void printPerimeter();
}

class Rectangle implements Shape{
    int length = 30;
    int breadth = 40;
    public void printArea() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
    public void printPerimeter(){
        System.out.println("Perimeter of Rectangle: "+2*(length+breadth));
    }

}

class Triangle implements Shape{
    double b=15;
    double height = 12;
    double a = 10;
    double c = 25;
    public void printArea(){
        System.out.println("Area of Triangle: "+0.5*b*height);
    }
    public void printPerimeter(){
        System.out.println("Perimeter of Triangle: "+(a+b+c));
    }
    
}
class Circle implements Shape{
    double pi = 3.14;
    double r = 5.6;
    public void printArea(){
        System.out.println("Area of Circle: "+pi*(r*r));
    }
    public void printPerimeter(){
        System.out.println("Perimeter of Circle: "+2*pi*r);
    }
}
