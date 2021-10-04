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
