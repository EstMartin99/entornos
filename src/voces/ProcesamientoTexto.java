package voces;

/**
 * Clase que simula un sistema de procesamiento de texto básico.
 * Permite convertir texto a mayúsculas y a minúsculas.
 *
 * @author Esteban Martin
 * @version 1.0
 * @since 2024-03-30
 */
public class ProcesamientoTexto {
    // Atributos
    private String texto;

    /**
     * Método para convertir texto a mayúsculas.
     *
     * @param texto El texto que se va a convertir.
     * @return El texto convertido a mayúsculas.
     */
    public String convertirAMayusculas(String texto) {
        this.texto = texto.toUpperCase();
        return this.texto;
    }

    /**
     * Método para convertir texto a minúsculas.
     *
     * @param texto El texto que se va a convertir.
     * @return El texto convertido a minúsculas.
     */
    public String convertirAMinusculas(String texto) {
        this.texto = texto.toLowerCase();
        return this.texto;
    }
}
