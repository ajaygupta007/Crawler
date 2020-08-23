import java.awt.*;

public class MyFlowLayout {
    Frame f;
    MyFlowLayout()
    {
        f=new Frame();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFlowLayout();
    }
}
