public class busquedaSubCadenas {
    public static void main(String[] args) {
        //Buscar cadenas
        //indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println(indice1);
        System.out.println(cadena1.indexOf("Mundo"));
        //metodo lastIndexOf - Devuelve la ultima aparicion de la subcadena
        //Subcadena de Mundo
        System.out.println(cadena1.lastIndexOf("Mundo"));
        //Para la subcadena no encontrada devuelve -1
        System.out.println(cadena1.indexOf("Java"));
    }
    
}
