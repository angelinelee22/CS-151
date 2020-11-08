import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class GraphView {    
    // variables
    private final int GRAPH_HEIGHT = 500;
    private final int GRAPH_WIDTH = 500;
    private Numbers model;
    private JLabel graph;

    public GraphView(Numbers model) {
        this.model = model;  
        GraphIcon graphTemp = new GraphIcon(GRAPH_WIDTH, GRAPH_HEIGHT, model);
        graph = new JLabel(graphTemp);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.add(graph);
        frame.pack();
    }
    
    public ActionListener refresh(){
        return (event)-> graph.repaint();
    }
}