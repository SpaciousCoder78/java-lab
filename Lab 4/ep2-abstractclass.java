abstract class Animal{
  public abstract void animalSound();
  public void sleep(){
    System.out.println("zzz");
  }
}
class Pig extends Animal{
  public void animalSound(){
    System.out.println("The pig says: wee wee");
  }
}

class Main{
  public static void main(String[] args){
    Pig mypig = new Pig();
    mypig.animalSound();
    mypig.sleep();
  }
}
