package graficarhash;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author Slam
 * Clase para impresión de gráfico a partir de una cadena de texto de 32 bits
 * La cadena debe estar en Hexadecimal, 
 * de lo contrario no podrá ver todos los puntos.
 */
class JPanelSegmentoCMP extends JPanel {
    private int[] values;

    public JPanelSegmentoCMP(int[] values, int width, int height) {
        this.values = values;
        this.setSize(width, height);
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.setAlignmentY(CENTER_ALIGNMENT);
        this.setLocation(20, 30);
        this.setBackground(Color.WHITE);
    }    

    /* Reescritura del método paintComponent */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Dibujar ejes y etiquetas
        int padding = 50;
        g2d.setColor(Color.BLACK);

        //Eje Y
        g2d.draw(new Line2D.Double(padding, padding, padding, height - padding));
        for (int i = 0; i < 16; i++) {
            int y = height - padding - (i * (height - 2 * padding) / 15);
            g2d.drawString(Integer.toHexString(i).toUpperCase(), 10, y + 5);
        }

        //Eje X
        g2d.draw(new Line2D.Double(padding, height - padding, width - padding, height - padding));
        for (int i = 0; i < 32; i++) {
            int x = padding + (i * (width - 2 * padding) / 31);
            g2d.drawString(String.valueOf(i), x - 5, height - padding + 20);
        }

        g2d.setColor(Color.BLUE);
        int pointDiameter = 10;

        // Dibujar puntos y líneas de conexión
        for (int i = 0; i < values.length; i++) {
            int x = padding + (i * (width - 2 * padding) / 31);
            int y = height - padding - (values[i] * (height - 2 * padding) / 15);
            Ellipse2D.Double circle = new Ellipse2D.Double(x - pointDiameter / 2, y - pointDiameter / 2, pointDiameter, pointDiameter);
            g2d.fill(circle);
            if (i > 0) {
                int prevX = padding + ((i - 1) * (width - 2 * padding) / 31);
                int prevY = height - padding - (values[i - 1] * (height - 2 * padding) / 15);
                g2d.draw(new Line2D.Double(prevX, prevY, x, y));
            }
        }

        g2d.drawString("Valor hexadecimal (0-F)", 10, 30);
        g2d.drawString("Posición (0-31)", width - 100, height - padding + 40);
    }
}
