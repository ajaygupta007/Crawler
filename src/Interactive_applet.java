import java.applet.Applet;
import  java.awt.*;

public class Interactive_applet extends Applet {
    TextField inputA,inputB;

    @Override
    public void init() {
        inputA =new TextField(8);
        inputB =new TextField(8);
        add(inputA);
        add(inputB);
        inputA.setText("78");
        inputB.setText("98");
    }
    public void paint(Graphics g)
    {
        int x=0;
        int y=0;
        int z=0;
        String s;
        g.drawString("enter two values",10,50);
        try{
            s=inputA.getText();
            x=Integer.parseInt(s);
            s=inputB.getText();
            y=Integer.parseInt(s);
            z=x+y;
            s=String.valueOf(z);
            g.drawString("the sum is:",10,75);
            g.drawString(s,100,75);

        }
        catch (Exception e)
        {

        }

    }

}
