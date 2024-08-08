public class masConcatenacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Angel";
        var cadena2 = "Herrera";
        var cadena3 = cadena1 + " " +cadena2;
        System.out.println(cadena3);
        //metodo concat
        cadena3 = cadena1.concat(" ").concat("Herrera");
        System.out.println("Usando concat " +cadena3);

        //Metodo clase StringBuilder
        var constructorCadena = new StringBuilder();
        //constructorCadena.append(cadena1);
        //constructorCadena.append(" ");
        //constructorCadena.append(cadena2);
        constructorCadena.append(cadena1).append(" ").append(cadena2);
        
        var resultado = constructorCadena.toString(); //metodo .toString = resultado
        System.out.println("resultado:" +resultado);

        /*Metodo clase StringBuffer NOTA: esta clase es similiar a stringbuilder
        pero es seguro cuando estamos trabajando con varios hilos(procesos) a la vez
        varios procesos se estan ejecutando a la vez
        /*/ 
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("StringBuffer: " +stringBuffer);

        //Metodo Join
        resultado = String.join(" ", cadena1, cadena2, "Acevedo");
        System.out.println("Resultado final:" +resultado);




        
    }
    
}
