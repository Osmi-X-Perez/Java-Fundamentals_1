
import java.util.Scanner;


public class Scanner_ejercico {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine(); //next.Line() detiene el  programa,type informcion en la consola y le agrega ese valor a consola
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el título:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo +  " " + usuario);
        //Ejercicio 
        System.out.println("Proporciona el título ");
        Scanner libro = new Scanner(System.in);
        var titulo1 = libro.nextLine();
        System.out.println("Proporciona el autor ");
        var autor = libro.nextLine();
        System.out.println(titulo1 + "fue escrito por " + autor);
    }
}
