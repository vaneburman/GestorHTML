package clases;

import java.util.StringJoiner;

public class ElementoP extends Elemento{
    private String texto;

    public ElementoP(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Propósito: Generar un String para renderizar un párrafo en HTML con el texto seteado
     * @return devuelve un String equivalente a la etiqueta párrafo de HTML.
     */
    @Override
    public String devolverElemento() {
        String p = "<p> $texto </p>";
        p = p.replace("$texto", texto);
        return p;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElementoP.class.getSimpleName() + "[", "]")
                .add("texto='" + texto + "'")
                .toString();
    }
}
