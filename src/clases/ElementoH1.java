package clases;

import java.util.StringJoiner;

public class ElementoH1 extends Elemento{
    private String titulo;

    public ElementoH1(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String devolverElemento() {
        String h1 = "<h1> $title </h1>";
        h1 = h1.replace("$title", titulo);
        return h1;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElementoH1.class.getSimpleName() + "[", "]")
                .add("titulo='" + titulo + "'")
                .toString();
    }
}
