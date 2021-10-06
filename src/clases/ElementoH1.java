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

    /**
     * Propósito: A partir de un String titulo, devuelve un String equivalente al cuerpo de un elemento h1
     * @return devuelve un String equivalente al cuerpo del elemento h1, reemplazando el titulo
     */
    @Override
    public String devolverElemento() {
        String h1 = "<center><h1> $title </h1></center>";
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
