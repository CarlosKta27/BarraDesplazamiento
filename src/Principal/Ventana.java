package Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ventana extends JFrame implements AdjustmentListener {
    JPanel panel;
    BorderLayout borderLayout = new BorderLayout();
    JScrollBar rojo,verde,azul;
    JLabel Color;
    GridLayout gridLayout;
    int r=0,g=0,b=0;

    void init()
    {
        panel = new JPanel();
        Color = new JLabel("Color");
        setLayout(borderLayout);

        rojo = new JScrollBar();
        verde = new JScrollBar();
        azul = new JScrollBar();

        rojo.setOrientation(0);
        azul.setOrientation(0);
        verde.setOrientation(0);


        add(Color,BorderLayout.NORTH);
        gridLayout = new GridLayout(3,1);
        panel.setLayout(gridLayout);
        panel.add(rojo);
        panel.add(verde);
        panel.add(azul);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        r = rojo.getValue();
        g = verde.getValue();
        b = azul.getValue();
        setTitle("R"+r+"G"+g+"B"+b);
    }
}
