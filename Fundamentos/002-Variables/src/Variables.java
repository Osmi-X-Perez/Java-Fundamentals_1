
public class Variables {

    public static void main(String srgs[]) {
        /*
        *
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        //sout + tab para llenar llo  de println
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        // ctrl + espacio para mostrar las varibales ya definidas
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        // Ctrl + clic izq en una variable nos lleva a donde se definió esta misma
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java, usar solo en versiones superiores a 10 en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Mimir";
        //soutv + Tab nos manda a imprimir la ulima variable definida
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable; no se recomienda utilizar acentos
        //var $miVariable = 2; no se recomienda utlizar caracteres especiales
        *
         */

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);
        System.out.println(i + j + usuario);// se evaluan las expresiones de izq a der, primero se  hace la suma y luego se concatena
        System.out.println(usuario + i + j); // Contexto cadena, primero se concatena y se  toman los ints como strings
        System.out.println(usuario + (i + j));// Al uaar parentesis se modifica la prioridad y se hace primero la  suma
    }
}
