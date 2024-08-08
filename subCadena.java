public class subCadena {

    public static void main(String[] args) {
        //Subcadena retirar una cadena de una cadena mas larga
        var cadena1 = "Hola mundo";
        System.out.println(cadena1);

        /*Nota: Hola Mundo
                0123456789
        */

        //subacadena metodo .substring()              0 es H y 4 es a "Hola"
        var subCadena1 = cadena1.substring(0, 4);
        System.out.println(subCadena1);
        //Ejercicio
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println(subcadena2);

    }
    
}
