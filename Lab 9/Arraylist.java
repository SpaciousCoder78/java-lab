import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 items to add to list: ");
        for(int i =0;i<3;i++){
            System.out.println("Item"+(i+1)+":");
            list.add(scanner.nextLine());
        }
        System.out.println("\n Your List: "+list);
        System.out.print("\n Enter an item to remove: ");
        String itemToRemove = scanner.nextLine();
        if(list.remove(itemToRemove)){
            System.out.println(itemToRemove+"removed");
        }
        else{
            System.out.println(itemToRemove+"not found");
        }
        System.out.println("\n Updated list: "+list );
        System.out.print("\nEnter index of item to retrieve: ");
        int index = scanner.nextInt();
        if(index>=0 && index<list.size()){
            System.out.println("Item at Index"+index+":"+list.get(index));
            
        }
        else{
            System.out.println("Index out of range");
        }
    }
}
