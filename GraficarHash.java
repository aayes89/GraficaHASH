package graficarhash;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
 *
 * @author Slam
 */
public class GraficarHash {    
    public static void main(String[] args) {
        // idea de la gráficación
        /*
        f----*        
        e------*
        d--------*---------*
        c---*------*
        b--*---------,...,
        a-*
        9
        8
    ,...,
        0 1 2 3 4 5 ,..., 31  
        */
     
        JFrame frame = new JFrame("Visualización de Hash");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        HashVisualization panel = new HashVisualization();
        frame.add(panel);
        frame.setVisible(true);
    }
}  

class HashVisualization extends JPanel {

    private String hash_str = "3e4f2a7d9b0c1e8f6d4a3b2c5e1f0d9a";
    private int[] values;

    public HashVisualization() {
        // Mapeo de cada dígito hexadecimal a su valor numérico
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        values = new int[hash_str.length()];
        for (int i = 0; i < hash_str.length(); i++) {
            char c = Character.toLowerCase(hash_str.charAt(i));
            for (int j = 0; j < hexChars.length; j++) {
                if (c == hexChars[j]) {
                    values[i] = j;
                    break;
                }
            }
        }
    }

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
