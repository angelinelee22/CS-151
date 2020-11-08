import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GraphIcon implements Icon{
    private Numbers model;
    private int width, height, maxHeight;
    private final double BAR_SIZE = 100.0;

    public GraphIcon(int width, int height, Numbers model) {
        this.model = model;
        this.width = width; //use this
        this.height = height;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D)g;

        // implement more proportionality
        Rectangle2D red = new Rectangle2D.Double(x + width/6.0, y + height * (1 - model.getRed() / 100.0), BAR_SIZE, (double)model.getRed()/100.0 * height);
        Rectangle2D green = new Rectangle2D.Double(x + 3 * width/6.0, y + height * (1 - model.getGreen() / 100.0), BAR_SIZE, (double)model.getGreen()/100.0 * height);
        Rectangle2D blue = new Rectangle2D.Double(x + 5 * width/6.0, y + height * (1 - model.getBlue() / 100.0), BAR_SIZE, (double)model.getBlue()/100.0 * height);

        g2.setColor(Color.red);
        g2.fill(red);
        g2.setColor(Color.blue);
        g2.fill(blue);
        g2.setColor(Color.green);
        g2.fill(green);
    }
}