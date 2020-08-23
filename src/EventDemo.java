import java.applet.Applet;
import java.awt.*;

public class EventDemo extends Applet {
    static final int n = 4;
    Label label;

    @Override
    public void init() {
        setLayout(new GridLayout(n, n));
        setFont(new Font("Helvetica", Font.BOLD, 24));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = (i * n) + j + 1;
                if (k < 16)
                    add(new Button(" " + k + 1));
            }
        }
        label = new Label("*", Label.CENTER);
        label.setFont(new Font("Time Roman", Font.ITALIC, 24));
        add(label);
    }

    public boolean action(Event e, Object obj) {
        if (e.target instanceof Button){
            label.setText((String) obj);
        }
        return false;
    }
}


