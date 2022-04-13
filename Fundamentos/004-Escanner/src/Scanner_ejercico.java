
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
    }
}
