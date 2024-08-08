public class remplazarSubCadenas {
    public static void main(String[] args) {
        //Remplazar subcadenas
        var cadena = "Hola mundo";
        System.out.println(cadena);

        //Reemplazar "Mundo" por "a todos"
        //metodo .replace()
        var nuevaCadena = cadena.replace("mundo", "a todos");
        System.out.println(nuevaCadena);

        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println(nuevaCadena);



        
    }
    
}
