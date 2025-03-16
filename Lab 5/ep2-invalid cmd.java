//EP2: Program to catch invalid command line arguments and also count the number of valid and invalid numbers
public class Exec{
    public static void main(String[] args){
        System.out.println("Total no of command line args: "+args.length);
        int valid = 0,invalid = 0;
        try{
            for(int i =0;i<args.length;i++){
                if(args[i].matches("\\d+")){
                    valid++;
                }
                else{
                    invalid++;
                }
            }
            System.out.println("Valid Arguments: "+valid);
            System.out.println("Invalid Arguments: "+invalid);
            throw new InvalidArgumentException (args);
        }
        catch (InvalidArgumentException e){
            System.out.println("An error occured: "+e.getMessage());
        }
        
    }
}
