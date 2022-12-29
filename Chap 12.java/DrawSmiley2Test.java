import javax.swing.JFrame;

  public class DrawSmiley2Test
  {
    public static void main(String[] args)
    {
      DrawSmiley2 panel = new DrawSmiley2(); 
      JFrame application = new JFrame();
      LabelFrame labelFrame = new LabelFrame(); 



        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250); 
        application.setVisible(true);
    }
  }
    

