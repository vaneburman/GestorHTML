package clases;

import interfaces.IElemento;
import interfaces.IPagina;

import java.util.ArrayList;


public class PaginaHTML implements IPagina {
    String pagina;

    public String getPagina() {
        return this.pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
    /**
     * Propósito: a partir de una lista de Elementos, recorre y transforma cada elementos a String y finalmente setea el String página.
     * @param arrayList es una lista de Elementos del tipo IElementos
     * @param plantilla es un String que actúa de template para generar la página
     */
    @Override
    public void estructurarPagina(ArrayList<IElemento> arrayList, String plantilla) {
        String linea="";
        for (IElemento elemento : arrayList) {
           linea = linea.concat(elemento.devolverElemento());
        }
        setPagina(plantilla.replace("$Body", linea));
    }

    @Override
    public String toString() {
        return pagina;
    }
}
