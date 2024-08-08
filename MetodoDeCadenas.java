public class MetodoDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        String cadena1 = "Hola Mundo";
        System.out.println(cadena1);

        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println(longitud);
        
        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println(nuevaCadena); //En vez de "Hola Mundo" seria "Hala Munda"
        
        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println(mayusculas);

        //Convetir a minusculas
        //podemos llamar el metod desde el print
        System.out.println(cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = " Pedro Martin    ";
        System.out.println("Con espacios " +cadena2);
        //metodo .trim()
        System.out.println("Sin espacios " +cadena2.trim());


    





    }
    
}
