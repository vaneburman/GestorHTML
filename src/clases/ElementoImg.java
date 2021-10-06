package clases;

import java.util.StringJoiner;

public class ElementoImg extends Elemento{
    private String opcion;

    public ElementoImg(String opcion) {
        this.opcion = opcion;
    }

    public String getOpcion() {
        return this.opcion;
    }

    public void setOpcion(String opcion) {
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
            case "1":
                result = "<center><img src=\"assets/Brownies.jpg\" alt=\"Foto de Brownies\" width=\"400\"  /></center>";
                break;
            case "2":
                result = "<center><img src=\"assets/Cupcakes.jpg\" alt=\"Foto de Cupcakes\" width=\"400\"  /></center>";
                break;
            case "3":
                result = "<center><img src=\"assets/Donuts.jpg\" alt=\"Foto de Donas\" width=\"400\"  /></center>";
                break;
            case "4":
                result = "<center><img src=\"assets/Macarons.jpg\" alt=\"Foto de Macarons\" width=\"400\"  /></center>";
                break;
            default:
                result = "<center><img src=\"" + opcion + "\" alt=\"Nueva imagen\" width=\"400\"  /></center>";
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
