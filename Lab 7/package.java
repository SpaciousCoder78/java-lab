//ArithmeticOperations.java

package arithmetic;

public class ArithmeticOperations{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return(double)a/b;
    }
}

//Main.java

import arithmetic.ArithmeticOperations;

public class Main{
    public static void main(String[] args){
        ArithmeticOperations operations = new ArithmeticOperations();
        int a =10;
        int b = 5;
        System.out.println("Addition: "+operations.add(a,b));
        System.out.println("Subtraction: "+ operations.subtract(a,b));
        System.out.println("Multiplication: "+operations.multiply(a,b));
        System.out.println("Division: "+ operations.divide(a,b));
    }
}
