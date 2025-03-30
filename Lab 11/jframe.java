
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Main extends JFrame implements KeyListener{
    private JLabel label;
    public Main(){
        setTitle("Keyboard event example");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Press any key",JLabel.CENTER);
        add(label);
        addKeyListener(this);
        setFocusable(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
        label.setText("Key Typed: "+keyChar);
    }
    @Override
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        label.setText("Key Pressed: "+KeyEvent.getKeyText(keyCode));
    }
    @Override
    public void keyReleased(KeyEvent e){
        int keyCode = e.getKeyCode();
        label.setText("Key Released: "+KeyEvent.getKeyText(keyCode));
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(->{
            Main example =  new Main();
            example.setVisible(true);
        };
    }
}
