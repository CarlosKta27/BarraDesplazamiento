package Principal;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    JPanel panel;
    BorderLayout borderLayout = new BorderLayout();
    JScrollBar rojo,verde,azul;
    JLabel Color;
    Color negro = new Color(0);
    GridLayout gridLayout;
    void init()
    {
        gridLayout = new GridLayout(3,1);
        panel = new JPanel();
        Color = new JLabel("Color");
        setLayout(borderLayout);
        rojo = new JScrollBar();
        verde = new JScrollBar();
        azul = new JScrollBar();
        rojo.setBackground(negro);
        add(Color);
        panel.setLayout(gridLayout);
        panel.add(rojo,BorderLayout.NORTH);
        panel.add(verde,BorderLayout.NORTH);
        panel.add(azul,BorderLayout.NORTH);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
