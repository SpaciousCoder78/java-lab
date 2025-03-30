import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        String str = "File Handling in Java using FileReader and FileWriter";
        FileWriter fw = new FileWriter("output.txt");
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        fw.close();
        int ch;
        System.out.println("Writing successful");
        FileReader fr = null;
        try{
            fr = new FileReader("output.txt");
        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
        }
        while((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }
}
