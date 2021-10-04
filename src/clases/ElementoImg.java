package clases;

import java.util.StringJoiner;

public class ElementoImg extends Elemento{
    private int opcion;

    public ElementoImg(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return this.opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     * Propósito: setear la opción de imágen seleccionada para renderizar en la página HTML
     * @return devuelve un String equivalente a la etiqueta imagen, con el source correspondiente al atributo opción.
     */
    @Override
    public String devolverElemento() {
        String result;

        switch (opcion){
            case 1:
                result = "<img src=\"assets/Brownies.jpg\" alt=\"Foto de Brownies\" />";
                break;
            case 2:
                result = "<img src=\"assets/Cupcakes.jpg\" alt=\"Foto de Cupcakes\"  />";
                break;
            case 3:
                result = "<img src=\"assets/Donuts.jpg\" alt=\"Foto de Donas\" />";
                break;
            case 4:
                result = "<img src=\"assets/Macarons.jpg\" alt=\"Foto de Macarons\" />";
                break;
            default:
                result = "<img src=\"assets/default.png\" alt=\"Error de imagen\" />";
        }

        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ElementoImg.class.getSimpleName() + "[", "]")
                .add("opcion=" + opcion)
                .toString();
    }
}
