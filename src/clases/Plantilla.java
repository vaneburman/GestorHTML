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
