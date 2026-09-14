// JellyBeanDemo.java - Q5: JavaBean Jelly Component
import java.awt.*;
import java.awt.event.*;

public class JellyBeanDemo extends Frame {
    public JellyBeanDemo() {
        JellyBean jb = new JellyBean();
        jb.setJellyColor(Color.GREEN);
        add(jb);

        setTitle("Jelly Bean Component");
        setSize(250, 250);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new JellyBeanDemo();
    }
}

// JavaBean Component
class JellyBean extends Canvas {
    private Color jellyColor = Color.RED;

    public void setJellyColor(Color color) {
        this.jellyColor = color;
        repaint();
    }

    public Color getJellyColor() {
        return jellyColor;
    }

    public void paint(Graphics g) {
        g.setColor(jellyColor);
        g.fillOval(50, 50, 100, 60);
    }
}
