import javax.swing.*;
import java.awt.*;

public class Grafica extends JFrame {
    private Color[] colori = {Color.RED, Color.RED, Color.RED}; // inizialmente tutti rossi

    public Grafica() {
        setTitle("Semaforo Thread!");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Metodo per cambiare il colore di un semaforo (0, 1 o 2)
    public void setColore(int index, Color c) {
        if (index >= 0 && index < 3) {
            colori[index] = c;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int baseX = 50;
        for (int i = 0; i < 3; i++) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(baseX + i * 100, 70, 50, 130);
            g.setColor(colori[i]);
            g.fillOval(baseX + i * 100 + 5, 80, 40, 40);
        }
    }
}
