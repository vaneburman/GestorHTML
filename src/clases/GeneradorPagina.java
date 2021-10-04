package clases;

import interfaces.IGenerable;
import interfaces.IPagina;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeneradorPagina implements IGenerable {

    FileWriter filewriter = null;
    PrintWriter printw = null;


    @Override
    public void generarPaginas(ArrayList<IPagina> arrayList2) throws IOException {
        int nroPagina = 1;
        for (IPagina pagina : arrayList2){

            String src = "src/Pagina$nro.html";
            src = src.replace("$nro", String.valueOf(nroPagina));

            filewriter = new FileWriter(src);//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            System.out.println("esta es la pagina creada");
            System.out.println(pagina);

            printw.println(pagina);
            printw.close();
            System.out.println("pagina generada correctamente");
            nroPagina++;

            }

    }
}
