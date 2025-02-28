package graficarhash;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Slam Clase controladora
 */
public class Controlador implements Serializable {

    private static long UID = 1L;   // para función serializable (evita corrupción al guardar)
    private String mi_hash;// = "3E4F2A7D9B0C1E8F6D4A3B2C5E1F0D9A";
    private String cuerpo_texto;// = "3E4F2A7D9B0C1E8F6D4A3B2C5E1F0D9A";
    private int[] datos_mi_hash;
    private int[] datos_cuerpo_texto;
    File archivo_analisis;

    /* Constructores */
    public Controlador(String mi_hash, String cuerpo_texto, int[] datos_mi_hash, int[] datos_cuerpo_texto) {
        this.mi_hash = mi_hash;
        this.cuerpo_texto = cuerpo_texto;
        this.datos_mi_hash = datos_mi_hash;
        this.datos_cuerpo_texto = datos_cuerpo_texto;
        this.archivo_analisis = null;
    }

    public Controlador() {
        this.mi_hash = "";
        this.cuerpo_texto = "";
        this.datos_mi_hash = new int[0];
        this.datos_cuerpo_texto = new int[0];
        this.archivo_analisis = null;
    }

    /* Funciones auxiliares*/
    public void limpiarCampos() {
        this.mi_hash = "";
        this.cuerpo_texto = "";
        this.datos_mi_hash = null;
        this.datos_cuerpo_texto = null;
        this.archivo_analisis = null;
    }

    /* Getters y Setters*/
    public File getArchivo_analisis() {
        return archivo_analisis;
    }

    public void setArchivo_analisis(File archivo_analisis) {
        this.archivo_analisis = archivo_analisis;
    }

    public String getMi_hash() {
        return mi_hash;
    }

    public void setMi_hash(String mi_hash) {
        this.mi_hash = mi_hash;
    }

    public String getCuerpo_texto() {
        return cuerpo_texto;
    }

    public void setCuerpo_texto(String cuerpo_texto) {
        this.cuerpo_texto = cuerpo_texto;
    }

    public int[] getDatos_mi_hash() {
        return datos_mi_hash;
    }

    public void setDatos_mi_hash(int[] datos_mi_hash) {
        this.datos_mi_hash = datos_mi_hash;
    }

    public int[] getDatos_cuerpo_texto() {
        return datos_cuerpo_texto;
    }

    public void setDatos_cuerpo_texto(int[] datos_cuerpo_texto) {
        this.datos_cuerpo_texto = datos_cuerpo_texto;
    }

}
