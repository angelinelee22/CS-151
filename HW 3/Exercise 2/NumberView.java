import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberView {
    private Numbers model;
    private JLabel redLabel = new JLabel("Red: ");
    private JLabel greenLabel = new JLabel("Green: ");
    private JLabel blueLabel = new JLabel("Blue: ");
    private JTextField redInput = new JTextField(15);
    private JTextField greenInput = new JTextField(15);
    private JTextField blueInput = new JTextField(15);
    private JButton updateButton = new JButton("Update");

    public void addActionListener(ActionListener a){
        updateButton.addActionListener(a);
    }

    public NumberView(Numbers model){
        this.model = model;

        // JPanel setup
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel bluePanel = new JPanel();

        redPanel.add(redLabel);
        greenPanel.add(greenLabel);
        bluePanel.add(blueLabel);

        redPanel.add(redInput);
        greenPanel.add(greenInput);
        bluePanel.add(blueInput);
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!redInput.getText().isBlank() && !greenInput.getText().isBlank() && !blueInput.getText().isBlank()) {
                    model.setRed(Integer.parseInt(redInput.getText()));
                    model.setGreen(Integer.parseInt(greenInput.getText()));
                    model.setBlue(Integer.parseInt(blueInput.getText()));
                }
            }
        });

        // frame setup
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
        frame.add(updateButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}