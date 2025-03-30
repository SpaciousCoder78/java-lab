import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Main extends Applet{
    private String greeting;
    @Override
    public void init(){
        int hour = java.time.LocalTime.now().getHour();
        if(hour>=6 && hour<12){
            greeting = "Good Morning";
        }
        else if(hour>=12 && hour<18){
            greeting = "Good Afternoon";
        }
        else if(hour>=18 && hour<24){
            greeting = "Good Evening";
        }
        else{
            greeting ="Hello";
        }
    }
    @Override
    public  void paint(Graphics g){
        g.drawString(greeting,50,50);
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Time greeting applet");
        Main applet = new Main();
        frame.add(applet);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
