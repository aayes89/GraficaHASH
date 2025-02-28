package graficarhash;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Slam
 * Clase para impresión de gráfico a partir de un archivo físico. 
 * La cadena debe estar en Hexadecimal, 
 * de lo contrario no podrá ver todos los puntos.
 * Implementa un scrollbar para mover la venta del gráfico.
 */

class JPanelSegmentoBusqueda extends Panel {
    private int[] values;
    private int offsetX = 0;  // Índice inicial en X
    private static final int VENTANA = 32;  // Cantidad de valores visibles

    public JPanelSegmentoBusqueda(int[] values, int width, int height, Scrollbar scrollBar) {
        this.values = values;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.WHITE);

        // Configurar Scrollbar
        scrollBar.setMinimum(0);
        scrollBar.setMaximum(values.length - VENTANA);
        scrollBar.setUnitIncrement(1);
        scrollBar.setBlockIncrement(4);
        scrollBar.setVisibleAmount(VENTANA);

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                offsetX = e.getValue();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int padding = 50;

        // Dibujar eje Y
        g2d.setColor(Color.BLACK);
        g2d.draw(new Line2D.Double(padding, padding, padding, height - padding));
        for (int i = 0; i < 16; i++) {
            int y = height - padding - (i * (height - 2 * padding) / 15);
            g2d.drawString(Integer.toHexString(i).toUpperCase(), 10, y + 5);
        }

        // Dibujar eje X
        g2d.draw(new Line2D.Double(padding, height - padding, width - padding, height - padding));

        int maxVisible = Math.min(offsetX + VENTANA, values.length);
        for (int i = offsetX; i < maxVisible; i++) {
            int x = padding + ((i - offsetX) * (width - 2 * padding) / (VENTANA - 1));
            g2d.drawString(String.valueOf(i), x - 5, height - padding + 20);
        }

        // Dibujar puntos y líneas
        g2d.setColor(Color.BLUE);
        int pointDiameter = 10;
        for (int i = offsetX; i < maxVisible; i++) {
            int x = padding + ((i - offsetX) * (width - 2 * padding) / (VENTANA - 1));
            int y = height - padding - (values[i] * (height - 2 * padding) / 15);

            g2d.fill(new Ellipse2D.Double(x - pointDiameter / 2, y - pointDiameter / 2, pointDiameter, pointDiameter));

            if (i > offsetX) {
                int prevX = padding + ((i - 1 - offsetX) * (width - 2 * padding) / (VENTANA - 1));
                int prevY = height - padding - (values[i - 1] * (height - 2 * padding) / 15);
                g2d.draw(new Line2D.Double(prevX, prevY, x, y));
            }
        }

        g2d.setColor(Color.BLACK);
        g2d.drawString("Valor hexadecimal (0-F)", 10, 30);
        g2d.drawString("Posición (" + offsetX + "-" + (maxVisible - 1) + ")", width - 150, height - padding + 40);
    }
}
