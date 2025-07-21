package graficarhash;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Slam 
 * Clase encargada de cargar los datos en la clase Controlador
 */
public class GHVCargarSegmentos extends javax.swing.JFrame {

    Controlador ctrl;
    GHVisual ghv;

    /* Constructores  */
    public GHVCargarSegmentos() {
        initComponents();
    }
    /* Recibe la clase Controlador para almacenar los datos */
    public GHVCargarSegmentos(GHVisual ghv, Controlador ctrl) {
        this.ctrl = ctrl;
        this.ghv = ghv;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jftTexto = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar segmentos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Segmento comparador a partir de un texto"));

        jLabel1.setText("Texto a convertir:");

        try {
            jftTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftTexto.setToolTipText("Puede ser un HASH o un texto cualquiera");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jftTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segmento de búsqueda"));

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cargar datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Limpiar los campos en el JFrame y clase Controlador
        limpiarJFormattedText();
        limpiarAtributosRelacionados();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Mapea los datos recibidos y muestra mensaje según estado (true - hay datos, false - no hay datos)
        ctrl.setMi_hash(jftTexto.getText().toUpperCase().trim());
        //System.out.println("TExto capturado: " + ctrl.getMi_hash() + ".");
        boolean estado = mapearDatos(ctrl.getMi_hash(), ctrl.getDatos_mi_hash(), 0);
        mostrarMensaje(estado, 0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Restaura los datos almacenados en Controlador
        limpiarAtributosRelacionados();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Carga un fichero, Mapea los datos recibidos y muestra mensaje según estado (true - hay datos, false - no hay datos)
        int salida = cargarArchivo();
        if (salida == 0) {
            procesarDatos(); // la carga fue correcta, procede a realizar operaciones con el contenido
        } else {
            mostrarMensaje(false, salida);  // mensaje de error específico
        }
        boolean estado = mapearDatos(ctrl.getCuerpo_texto(), ctrl.getDatos_cuerpo_texto(), 1);
        mostrarMensaje(estado, 1);  // mensaje de error
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Aplica Dispose a la ventana actual y habilita elementos del menu Opciones
        regresarAVistaPrincipal();
    }//GEN-LAST:event_jButton5ActionPerformed
    void regresarAVistaPrincipal() {
        ghv.restaurarEstadoElementoMenu();
        this.dispose();
    }

    void mostrarMensaje(boolean valor, int tipo) {
        String mensaje = "¡Los datos fueron procesados correctamente!";
        String mensaje_err = "¡Los datos no fueron procesados correctamente\nRevise los datos de entrada!";
        String mensaje_err1 = "¡Los datos no fueron procesados correctamente\nRevise que el archivo no esté vacío!";
        if (valor == true) {
            JOptionPane.showMessageDialog(rootPane, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tipo == 0) {
                JOptionPane.showMessageDialog(rootPane, mensaje_err, "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, mensaje_err1, "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    /* Carga un fichero del equipo usando JFileChooser */
    int cargarArchivo() {        
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jPanel1);
        File archivo_analisis = jfc.getSelectedFile();
        if (archivo_analisis == null) {
            mostrarMensaje(false, 1);
            return 1; // error
        } else {
            // agregar al ctrl
            ctrl.setArchivo_analisis(archivo_analisis);
        }
        return 0; // todo ok
    }

    /* Obtiene los datos convertidos en Hexadecimal y los traslada al Controlador */
    void procesarDatos() {
        try {
            String cuerpo_texto = convertirDatosAHex(ctrl.getArchivo_analisis());
            ctrl.setCuerpo_texto(cuerpo_texto);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /* Convierte los bytes de un fichero a hexadecimal */
    String convertirDatosAHex(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        int bytesRead = fis.read(buffer);
        if (bytesRead == -1) {
            throw new IOException("No se pudo leer el archivo.");
        }

        StringBuilder hexString = new StringBuilder();
        for (byte b : buffer) {
            hexString.append(String.format("%02X", b)); // Formato hexadecimal en mayúsculas
        }
        return hexString.toString();
    }

    /* Convierte un texto ASCII a hexadecimal */
    boolean mapearDatos(String texto, int[] valores, int seleccion) {
        if (texto.isEmpty() || texto.length() == 0) {
            return false;
        }
        // Mapeo de cada dígito hexadecimal a su valor numérico
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        valores = new int[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            for (int j = 0; j < hexChars.length; j++) {
                if (c == hexChars[j]) {
                    valores[i] = j;
                    break;
                }
            }
        }
        if (seleccion == 0) {
            ctrl.setDatos_mi_hash(valores);
        } else {
            ctrl.setDatos_cuerpo_texto(valores);
        }
        return true;
    }

    /* Funcionalidades auxiliares */
    void limpiarJFormattedText() {
        this.jftTexto.setText("");
    }

    void limpiarAtributosRelacionados() {
        ctrl.limpiarCampos();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GHVCargarSegmentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GHVCargarSegmentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GHVCargarSegmentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GHVCargarSegmentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GHVCargarSegmentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jftTexto;
    // End of variables declaration//GEN-END:variables
}
