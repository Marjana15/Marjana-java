import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame; 
import java.awt.FlowLayout;
import javax.swing.JLabel;





    public class DrawSmiley2 extends JPanel
    {
      public void paintComponent(Graphics g)
      {

        super.paintComponent(g);
	    g.setColor(Color.YELLOW); 
        g.fillOval(10, 10, 200, 200);

		g.setColor(Color.BLACK); 
        g.fillOval(55, 65, 30, 30); 
        g.fillOval(135, 65, 30, 30);
          
	    g.fillOval(50, 110, 120, 60);

		g.setColor(Color.YELLOW); 
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

		}

        public class LabelFrame extends JFrame
        {
            private final JLabel label1;

            public LabelFrame()
            {
                super("Testing JLabel");
                setLayout(new FlowLayout()); 

                label1 = new JLabel("Label with text"); 
                label1.setToolTipText("This is a Smiley"); 
                add(label1); 
            }
        }
    

  }

