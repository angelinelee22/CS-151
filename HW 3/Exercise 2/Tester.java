import javax.swing.*;
import java.awt.*;

public class Tester {
    public static void main(String[] args) {
        Numbers model = new Numbers(10, 2 , 6);
        NumberView numberFrame = new NumberView(model);
        GraphView graphFrame = new GraphView(model);

        // attaches GraphView to the Model object
        numberFrame.addActionListener(graphFrame.refresh());
    }
}