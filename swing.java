import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Main extends JApplet{
    private JLabel label;
    private JScrollBar scrollbar;

    @Override
    public void init(){
        label = new JLabel("Value:0");
        label.setHorizontalAlignment(JLabel.CENTER);
        scrollbar = new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,100);
        scrollbar.setPreferredSize(new Dimension(200,20));
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Value: "+scrollbar.getValue());
            }
        });
        setLayout(new BorderLayout());
        add(label,BorderLayout.CENTER);
        add(scrollbar,BorderLayout.SOUTH);
    }
}
