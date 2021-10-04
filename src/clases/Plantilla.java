package clases;

import interfaces.ITransformable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plantilla implements ITransformable {
    private String data = "";

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Propósito: Generar el String equivalente al template file que le pasemos por argumento
     * @param file la función recibe un parámetro de tipo File, que escanea y transforma a String
     * @return devuelve un file transformado en String.
     * @throws FileNotFoundException si no se encuentra el file que se le pasa por argumento
     */
    @Override
    public String transformarAString(File file) throws FileNotFoundException {

       Scanner transform = new Scanner(file);
       while(transform.hasNextLine()){
           data = data.concat(transform.nextLine());
       }
        System.out.println(data);
        return data;
    }


}
