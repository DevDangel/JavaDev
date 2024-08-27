/*
Se solicita un programa para generar un valor de ID unico para cada persona.
El programa debe solicitar al usuario:
-Nombre
-Apellido
-Años de nacimiento (YYYY)
El programa deberá generar un valor aleatorio de 4 digitos, entre 1 y 9999
Si el numero generado es menor a 4 digitos se debe completar el valor con ceros
a la izquierda

Finalmente con los datos obtenidos debe generar un valor de ID unico
uniendo los valores de la siguiente forma:
Nombre: Juan = JU  Apellido:Perez = PE Año: 1995 = 95
Aleatorio: 0736  ID unico : JUPE950736
*/
//Importamos bibliotecas (Random||Scanner)

import java.util.Scanner;
import java.util.Random;

public class generadorID {
    public static void main(String[] args) {

        //con el metodo new llamamos a las bibliotecas para trabajar//
        var escaner = new Scanner(System.in);
        var random = new Random();
        //Titulos
        System.out.println("GENERADOR UNICO ID");
        ///Definimos variables con el metodo input///
        System.out.print("Ingrese su nombre:");
        var nombre = escaner.nextLine();
        System.out.print("Ingrese su apellido:");
        var apellido = escaner.nextLine();
        System.out.print("ingrese su año de nacimiento(YYYY)");
        var anioNacimiento = Integer.parseInt(escaner.nextLine());
        ///////////////////////////////////////////

        //Con la clase random definimos variable que contiene el numero aleatorio entre 1 y 9999//
        var numeroAleatorio = random.nextInt(9999) + 1;//(9999)+1 significa que el numero esta entre 1 y 9998 + 1
        ///////////////////////////////////////////////

        //definimos la variable que contiene el format "%04d" sobre el numero aleatorio.//
        /*Esto es para que si en la variable numeroAleatorio tenemos un numero menor a 4 digitos rellene con 0 hacia la
        izquierda hasta completar 4 digitos */
        var nAleatorioF = String.format("%04d", numeroAleatorio);
        /////////////////////////////////////////////////////////

        /*La variable "nombreID" contiene una subcadena ".substring" que solo extrae los caracteres que se encuentran en
        la posicion 0 y antes de la 2 es decir excluye el caracter que se encuentra en la posicion 2 y adelante, es como un rango
        ejemplo A=(0)n=(1)g=(2)e=(3)l=(4) el 0, 2 imprime desde --->0=(A)y excluye la posicon 2=(g) y solo imprime la posicion
        que se encuentra detras del 2=(g) es decir la 1=(n)resultado: (An) el metodo .toUpperCase(); es convertir a mayuscula
        toda clase de caracteres que se encuentre en una cadena y como solo imprime la posicion (incluyente:0, excluyente:2)
        es decir 0 y 1 y encima con el metodo touppercase el resultado seria (AN)*/
        var nombreID = nombre.substring(0, 2).toUpperCase().trim();
        var apellidoID = apellido.substring(0, 2).toUpperCase().trim();
        //////////////////////////////////////////////////////////

        /*Para extraer e imprimir los dos ultimos digitos de la variavle "anioNacimiento" se formula con el "% 100" esta
        formula de "1998 % 100" hace que el resultado sea "98" La expresión "1998 % 100" en programación se usa para
        calcular el módulo de la división de 1998 entre 100. El operador % devuelve el resto de la división.Cálculo 1998
        ÷ 100 = 19 con un resto de 98.1998 % 100 = 98.*/
        var anioNacimientoID = anioNacimiento % 100;
        /////////////////////////////////////////////

        ///Para que el ID sea unico lo definimos en una constante///
        /*La constante contiene un un "Stringbuilder()" un metodo para concatenar varias cadenas, en este caso estamos
        tambien uniendo eñ "anioNacimientoID" y "nAleatorioF" esto son tipos de datos enteros pero al ser un apendice
        en el ".append" se mandara a imprimir como cadenas un "mensaje" unido en esta caso el ID con todas las anteriores
        variables unidas en una sola*/
        final var ID_UNICO = new StringBuilder();
        ID_UNICO.append(nombreID).append(apellidoID).append(anioNacimientoID).append(nAleatorioF);
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Hola " + nombre);
        System.out.println("""
                \tTu nuevo numero de identificación (ID) generado por el sistema es:
                """
                + "\t" + ID_UNICO + "\n\tFelicidades.");


    }
}
