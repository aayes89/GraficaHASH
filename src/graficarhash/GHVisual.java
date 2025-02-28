package graficarhash;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Scrollbar;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Slam
 */
public class GHVisual extends javax.swing.JFrame {

    Controlador ctrl;

    /**
     * Creates new form GHVisual
     */
    public GHVisual() {
        initComponents();
        ctrl = new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSegmentoCmp = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jpSegBusqueda = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNuevaSesion = new javax.swing.JMenuItem();
        jmAbrirSesion = new javax.swing.JMenuItem();
        jmGuardarSesion = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCargarSegmentos = new javax.swing.JMenuItem();
        jmGraficar = new javax.swing.JMenuItem();
        jmIniciarBusqueda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualización de Hash");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        jpSegmentoCmp.setBorder(javax.swing.BorderFactory.createTitledBorder("Segmento Comparador"));

        javax.swing.GroupLayout jpSegmentoCmpLayout = new javax.swing.GroupLayout(jpSegmentoCmp);
        jpSegmentoCmp.setLayout(jpSegmentoCmpLayout);
        jpSegmentoCmpLayout.setHorizontalGroup(
            jpSegmentoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
        );
        jpSegmentoCmpLayout.setVerticalGroup(
            jpSegmentoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        jpSegBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Segmento de búsqueda"));
        jpSegBusqueda.setPreferredSize(new java.awt.Dimension(1024, 360));

        javax.swing.GroupLayout jpSegBusquedaLayout = new javax.swing.GroupLayout(jpSegBusqueda);
        jpSegBusqueda.setLayout(jpSegBusquedaLayout);
        jpSegBusquedaLayout.setHorizontalGroup(
            jpSegBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
        );
        jpSegBusquedaLayout.setVerticalGroup(
            jpSegBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jmNuevaSesion.setText("Nueva sesión");
        jmNuevaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevaSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmNuevaSesion);

        jmAbrirSesion.setText("Abrir sesión");
        jmAbrirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAbrirSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmAbrirSesion);

        jmGuardarSesion.setText("Guardar sesión");
        jmGuardarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuardarSesion);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jmCargarSegmentos.setText("Cargar segmentos");
        jmCargarSegmentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCargarSegmentosActionPerformed(evt);
            }
        });
        jMenu2.add(jmCargarSegmentos);

        jmGraficar.setText("Graficar segmentos");
        jmGraficar.setEnabled(false);
        jmGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGraficarActionPerformed(evt);
            }
        });
        jMenu2.add(jmGraficar);

        jmIniciarBusqueda.setText("Iniciar búsqueda");
        jmIniciarBusqueda.setEnabled(false);
        jmIniciarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIniciarBusquedaActionPerformed(evt);
            }
        });
        jMenu2.add(jmIniciarBusqueda);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpSegBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpSegmentoCmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpSegmentoCmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSegBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Acerca();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        Salir();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmCargarSegmentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCargarSegmentosActionPerformed
        // TODO add your handling code here:
        GHVCargarSegmentos ghvc = new GHVCargarSegmentos(this, ctrl);
        ghvc.setVisible(true);
    }//GEN-LAST:event_jmCargarSegmentosActionPerformed

    private void jmGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGraficarActionPerformed
        // TODO add your handling code here:
        System.out.println("size: " + ctrl.getDatos_mi_hash().length);
        System.out.println("size: " + ctrl.getDatos_cuerpo_texto().length);
        if (ctrl.getDatos_mi_hash().length > 0) {
            graficarDatosXSegmentosCMP();
        }
        if (ctrl.getDatos_cuerpo_texto().length > 0) {
            graficarDatosXSegmentosBusqueda();
        }

    }//GEN-LAST:event_jmGraficarActionPerformed

    private void jmIniciarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIniciarBusquedaActionPerformed
        // TODO add your handling code here:
        iniciarBusqueda();
    }//GEN-LAST:event_jmIniciarBusquedaActionPerformed

    private void jmNuevaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevaSesionActionPerformed
        // TODO add your handling code here:
        nuevaSesion();
        mostrarNoHecho();
    }//GEN-LAST:event_jmNuevaSesionActionPerformed

    private void jmAbrirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAbrirSesionActionPerformed
        // TODO add your handling code here:
        cargarSesion();
        mostrarNoHecho();
    }//GEN-LAST:event_jmAbrirSesionActionPerformed

    private void jmGuardarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarSesionActionPerformed
        // TODO add your handling code here:
        guardarSesion();
        mostrarNoHecho();
    }//GEN-LAST:event_jmGuardarSesionActionPerformed
    
    void nuevaSesion(){}
    void guardarSesion(){}
    void cargarSesion(){}
    
    void mostrarNoHecho(){
        String mensaje = "¡Disponible pronto!";
        JOptionPane.showMessageDialog(rootPane, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    void restaurarEstadoElementoMenu() {
        jmGraficar.setEnabled(true);
        jmIniciarBusqueda.setEnabled(true);
    }

    void graficarDatosXSegmentosCMP() {
        //System.out.println("X: " + jpSegmentoCmp.getWidth() + "; Y: " + jpSegmentoCmp.getHeight());        
        JPanelSegmentoCMP jpscmp = new JPanelSegmentoCMP(ctrl.getDatos_mi_hash(), jpSegmentoCmp.getWidth() - 50, jpSegmentoCmp.getHeight() - 50);
        jpSegmentoCmp.add(jpscmp);
        jpscmp.setVisible(true);
        this.repaint();
    }

    void graficarDatosXSegmentosBusqueda() {
        jpSegBusqueda.removeAll(); // Limpiar panel antes de agregar nuevos componentes
        jpSegBusqueda.setLayout(new BorderLayout()); // Asegurar layout adecuado

        Scrollbar scrollBar = new Scrollbar(Scrollbar.HORIZONTAL);
        JPanelSegmentoBusqueda jpsb = new JPanelSegmentoBusqueda(ctrl.getDatos_cuerpo_texto(),
                jpSegBusqueda.getWidth() - 50, jpSegBusqueda.getHeight() - 50, scrollBar);

        jpSegBusqueda.add(jpsb, BorderLayout.CENTER);
        jpSegBusqueda.add(scrollBar, BorderLayout.SOUTH);

        jpSegBusqueda.revalidate(); // Forzar actualización de la estructura de diseño
        jpSegBusqueda.repaint(); // Redibujar componentes
    }

    void iniciarBusqueda() {
        // Obtener los datos de ambas gráficas
        int[] datosCMP = ctrl.getDatos_mi_hash();  // Datos de la gráfica superior (patrón a buscar)
        int[] datosBusqueda = ctrl.getDatos_cuerpo_texto();  // Datos de la gráfica inferior (donde se busca)

        if (datosCMP.length == 0 || datosBusqueda.length == 0) {
            System.out.println("No hay datos en una de las gráficas.");
            return;
        }

        // Búsqueda de patrón con tolerancia
        int posicion = buscarPatronKMP(datosBusqueda, datosCMP);

        if (posicion != -1) {
            System.out.println("Patrón encontrado en el segmento: " + posicion);
            desplazarScroll(posicion);
        } else {
            System.out.println("No se encontró un patrón en el archivo.");
        }
    }

    /**
     * Implementación de KMP con tolerancia de valores (+1, -1, igual).
     *
     * @param datosBusqueda Array donde se buscará el patrón.
     * @param datosCMP Array del patrón a buscar.
     * @return Posición donde empieza la coincidencia o -1 si no se encontró.
     */
    int buscarPatronKMP(int[] datosBusqueda, int[] datosCMP) {
        int n = datosBusqueda.length;
        int m = datosCMP.length;

        // Construcción del prefijo-sufijo de KMP
        int[] lps = construirLPS(datosCMP);

        int i = 0; // Índice para datosBusqueda
        int j = 0; // Índice para datosCMP

        while (i < n) {
            if (coincideConTolerancia(datosBusqueda[i], datosCMP[j])) {
                i++;
                j++;

                if (j == m) {
                    return i - j; // Retorna la posición de inicio de la coincidencia
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1; // No encontrado
    }

    /**
     * Verifica si dos valores coinciden con la tolerancia especificada.
     *
     * @param valorBusqueda Valor actual en la serie de búsqueda.
     * @param valorCMP Valor del patrón a comparar.
     * @return true si está dentro del rango de tolerancia, false si no.
     */
    boolean coincideConTolerancia(int valorBusqueda, int valorCMP) {
        return valorBusqueda == valorCMP || valorBusqueda == valorCMP + 1 || valorBusqueda == valorCMP - 1;
    }

    /**
     * Construye la tabla LPS (Longest Prefix Suffix) para KMP.
     *
     * @param patron El patrón a analizar.
     * @return Un array con los valores de LPS.
     */
    int[] construirLPS(int[] patron) {
        int m = patron.length;
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (patron[i] == patron[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    /**
     * Mueve el scroll a la posición del segmento encontrado.
     *
     * @param posicion Índice del inicio del patrón encontrado.
     */
    void desplazarScroll(int posicion) {
        SwingUtilities.invokeLater(() -> {
            int pixelPos = posicion * 10; // Ajusta según la escala de la gráfica
            for(Component c: jpSegBusqueda.getComponents()){
                System.out.println(c.getName() + ": "+ c.toString());
            }
            //.getVerticalScrollBar().setValue(pixelPos);
        });
    }

    void Salir() {
        String mensaje = "¡Está cerrando el programa!\n¿Desea salir?";
        int opcion = JOptionPane.showConfirmDialog(rootPane, mensaje, "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.YES_OPTION == opcion) {
            System.exit(0);
        }

    }

    void Acerca() {
        String mensaje = "Hecho por Slam (2025)";
        JOptionPane.showMessageDialog(rootPane, mensaje, "GraficarHASH V0.0.1", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(GHVisual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GHVisual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GHVisual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GHVisual.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GHVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jmAbrirSesion;
    private javax.swing.JMenuItem jmCargarSegmentos;
    private javax.swing.JMenuItem jmGraficar;
    private javax.swing.JMenuItem jmGuardarSesion;
    private javax.swing.JMenuItem jmIniciarBusqueda;
    private javax.swing.JMenuItem jmNuevaSesion;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JPanel jpSegBusqueda;
    private javax.swing.JPanel jpSegmentoCmp;
    // End of variables declaration//GEN-END:variables
}
