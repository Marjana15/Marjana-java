import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class ButtonFrame1Test 

{
    public static void main(String[] args)
    JFrame application = new JFrame("A simple paint program");

    //aintPanel paintPanel = new PaintPanel();
    //application.add(paintPanel, BorderLayout.CENTER); 

    application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
    {
        ButtonFrame buttonFrame = new ButtonFrame(); 
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(475, 510); 
        buttonFrame.setVisible(true); 
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200); 
        application.setVisible(true); 


    }
}


