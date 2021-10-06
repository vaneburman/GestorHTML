package pruebas;

import clases.*;
import interfaces.IElemento;
import interfaces.IPagina;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/template.html";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de páginas: ");
        //cuantas paginas vamos a crear
        int pags = scanner.nextInt();
        ArrayList<IPagina> paginas = new ArrayList<>();

        //genero el template del html y lo paso a String
        File plantilla = new File(path);
        Plantilla template = new Plantilla();
        String templateString = template.transformarAString(plantilla);
        //pagina 1
        int acc = 1;
        while(acc <= pags) {
            PaginaHTML estructura = new PaginaHTML();
            //creo la lista de elementos de la página
            ArrayList<IElemento> listaElementos = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            //pido la info
            System.out.println("Defina el Theme de su página " + acc + ":");
            System.out.println("1. LIGHT");
            System.out.println("2. ULTRALIGHT");
            System.out.println("3. DARK");
            System.out.println("4. BLACK");

            String seleccion= sc.nextLine();

            BackgroundTheme theme;

            switch(seleccion){
                case "1":
                    theme = BackgroundTheme.LIGHT;
                    break;
                case "2":
                    theme = BackgroundTheme.ULTRALIGHT;
                    break;
                case "3":
                    theme = BackgroundTheme.DARK;
                    break;
                case "4":
                    theme = BackgroundTheme.BLACK;
                    break;
                default:
                    System.out.println("No se ha seleccionado un theme");
                    theme = BackgroundTheme.LIGHT;
            }

            listaElementos.add(theme);

            System.out.println("Ingrese el título de la página " + acc);
            String titulo = sc.nextLine();
            ElementoH1 elemH1 = new ElementoH1(titulo);
            listaElementos.add(elemH1);


            System.out.println("Ingrese el texto de su párrafo");
            String texto = sc.nextLine();
            ElementoP elemP = new ElementoP(texto);
            listaElementos.add(elemP);

            System.out.println("Ingrese la url de la imágen o seleccione una imagen por default: ");
            System.out.println("1. Brownies");
            System.out.println("2. Cupcakes");
            System.out.println("3. Donuts");
            System.out.println("4. Macarons");


            String opcion= sc.nextLine();
            ElementoImg elemImg = new ElementoImg(opcion);
            listaElementos.add(elemImg);

            //estructuro la página
            estructura.estructurarPagina(listaElementos, templateString);
            //agrego la página a la lista de páginas a generar
            paginas.add(estructura);
            acc++;
        }
        //genero las páginas
        GeneradorPagina generador = new GeneradorPagina();
        generador.generarPaginas(paginas);


    }
}
