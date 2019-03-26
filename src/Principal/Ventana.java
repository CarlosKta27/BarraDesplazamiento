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

        rojo.addAdjustmentListener(this);
        rojo.setMaximum(255);
        rojo.setMinimum(0);
        rojo.setVisibleAmount(0);
        verde.addAdjustmentListener(this);
        verde.setMaximum(255);
        verde.setMinimum(0);
        verde.setVisibleAmount(0);
        azul.addAdjustmentListener(this);
        azul.setMaximum(255);
        azul.setMinimum(0);
        azul.setVisibleAmount(0);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        Color color = new Color(r,g,b);
        Color.setOpaque(true);
        Color.setBackground(color);
        r = rojo.getValue();
        g = verde.getValue();
        b = azul.getValue();
        setTitle("R: "+r+" G: "+g+" B: "+b);
    }
}
