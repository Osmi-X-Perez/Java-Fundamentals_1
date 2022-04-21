
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String srgs[]){
        
        // tipos primitivos enteros: byte, short, int, long
        
        //(byte, int, long) conversion al tipo de variables dentro del parentesis
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;//L -> tipo long
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775808D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor  minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);
        
        // tipos primitivos de tipo flotante: float, double
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maxximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double " + Double.MAX_VALUE);
        
        
        //***********************Inferencia de tipos*****************************************
        
        //PAra correr en debug mode click derecho + debug file
        //Breakpoint -> click en la linea donde lo queremos del lado izq, donde estan los numeros de lineas y se hace una linea roja indicandolo
        //Con este debug  podemos saber el tipo de nuestras variables al hacer la  inferencia con la palabra var
        // F8 para la ejecucion de la sig linea de codigo en debug mode
        
        var numeroEntero = 20;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble1 = 19.0;
        System.out.println("numeroDouble1 = " + numeroDouble1);
        
        var numeroFloat1 = 18.0F;//solo hay F -> Float; D -> Double y L -> Long
        System.out.println("numeroFloat1 = " + numeroFloat1);
        
        
        //********************** Tipos primitivos tipo char************************
        
        char myChar = 'a';
        System.out.println("myChar = " + myChar);
        
        //Imprimiendo el valor de varChar ocupando el codigo unicode, del link en resources xd
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        //imprimir le valor de  un char ocupando codigo decimal, se encuentra en el mismo link anterior
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        //Del  mismo link puedes pegar y copiar simbolos que se encuentran alli y no tienes en tu teclado
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Ocupando inferencia de tipos
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        //no se ocupa decimal en la inferencia de tipos ya que el var cree  que es un int
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        //Char se  puede asignar a unn entero pero se convierte a su codigo decimal
        int varEnteraSimbolo = '!';
        System.out.println("varEnteraSimbolo = " + varEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
        
        
        //*****************Primitivos de tipo booleanos******************
        //Valores tipo bandera
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean ){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18;
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres  menor de edad");
        }
        
        //**************Conversion de tipos primitivos en Java - Ejercicio***********
        //Convertir tipo String a un tipo int
        var edad1 = Integer.parseInt("20");
        //var edad =  "20";
        System.out.println("edad1 = " + (edad1 + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        // Para comentar varias lineas, se seleccionan,se le pica al simbolo en la parte de arriba que parece  una L volteada con rayitas verdes
        //Pedir valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        // Convertir int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //.charAt(i) para regresar un caracter de un String donde i es el indice en la String, (los indices comienzan en 0 en Java)
        // caracter es de tipo char, no String
        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        //Se asigna solo el primer caracter en una String con el método charAt()
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        //**************Tienda de libros Ejercicio************
//        var consola = new Scanner(System.in);
//        System.out.println("Proporciona el nombre");
//        var nombre = consola.nextLine();
//        System.out.println("Proporciona el id");
//        var id = Integer.parseInt(consola.nextLine());
//        System.out.println("Proporciona el precio");
//        var precio = Double.parseDouble(consola.nextLine());
//        System.out.println("Proporciona el envío gratuito");
//        var envio = Boolean.parseBoolean(consola.nextLine());
//                
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envío Gratuito: " + envio);
        
    }
}
