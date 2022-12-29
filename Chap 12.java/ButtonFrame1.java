import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;


public class ButtonFrame1 extends JFrame
{
    private final JButton plainJButton; 
    private final JButton fancyJButton;

    public ButtonFrame1()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout()); 

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("images.jpg"));
        Icon bug2 = new ImageIcon(getClass().getResource("download.jpg"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2); 
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler(); 
        fancyJButton.addActionListener(handler); 
        plainJButton.addActionListener(handler); 
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==  plainJButton)
            {
                //public class PaintPanel extends JPanel 

                //public PaintPanel()
            

                    addMouseMotionListener(
                        new MouseMotionAdapter()
                        { 
                            public void mouseDragged(MouseEvent event)
                    
                            { 
                                points.add(event.getpoint());
                                repaint();

                            } 
                        }
                    );

                

                public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    for (Point point : points)
                    g.fillOval(point.x,point.y, 4, 4);
                }

            }
            //JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s" , event.getActionCommand()));
        }
    }
} 


