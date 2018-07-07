package UiFeatures;

import javax.swing.*;
import java.awt.*;

public class Display {
    private JFrame displayFrame;
    private Canvas displayCanvas;

    private int width, height;
    private String title;
    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay(){
        displayFrame = new JFrame(title);
        displayFrame.setSize(width, height);
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayFrame.setResizable(false);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.setVisible(true);

        displayCanvas = new Canvas();
        displayCanvas.setPreferredSize(new Dimension(width, height));
        displayCanvas.setMaximumSize(new Dimension(width, height));
        displayCanvas.setMinimumSize(new Dimension(width, height));
        displayCanvas.setFocusable(false);

        displayFrame.add(displayCanvas);
        displayFrame.pack();
    }

    public Canvas getDisplayCanvas(){
        return displayCanvas;
    }
    public JFrame getDisplayFrame(){
        return displayFrame;
    }
}
