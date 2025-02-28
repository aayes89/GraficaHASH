package graficarhash;

/**
 *
 * @author Slam
 * Imprime en la consola una gráfica ASCII de una cadena de texto hexadecimal
 */
public class HashGraphCMD {
    public static void main(String[] args) {
        // Ejemplo de hash de 32 dígitos (puedes cambiarlo por otro hash)
        String hashStr = "3e4f2a7d9b0c1e8f6d4a3b2c5e1f0d9a";
        int len = hashStr.length();
        int[] values = new int[len];

        // Convertir cada dígito hexadecimal a su valor numérico (0-15)
        for (int i = 0; i < len; i++) {
            char c = Character.toLowerCase(hashStr.charAt(i));
            int val;
            if (c >= '0' && c <= '9') {
                val = c - '0';
            } else {
                val = c - 'a' + 10;
            }
            values[i] = val;
        }

        // Imprimir la gráfica: el eje Y va de 15 (F) a 0.
        // Cada fila representa un valor hexadecimal
        for (int y = 15; y >= 0; y--) {
            // Imprimir etiqueta de la fila (valor hexadecimal)
            String label = Integer.toHexString(y).toUpperCase();
            System.out.print(label + " | ");
            // Para cada posición del hash, imprimir un asterisco si el valor coincide con 'y'
            for (int i = 0; i < len; i++) {
                if (values[i] == y) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Imprimir el eje X (línea de separación y etiquetas de posición)
        System.out.print("   + ");
        for (int i = 0; i < len; i++) {
            System.out.print("--");
        }
        System.out.println();
        System.out.print("     ");
        // Para facilitar la visualización, se muestran solo los dígitos (0-9) para las posiciones
        for (int i = 0; i < len; i++) {
            System.out.printf("%1d ", i % 10);
        }
        System.out.println();
    }
}
