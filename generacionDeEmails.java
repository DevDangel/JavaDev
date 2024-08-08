import java.util.Scanner;

public class generacionDeEmails {
    public static void main(String[] args) {
        /*Crear un generador de email con:
        Nombre: Angel David Herrera
        Empresa: soy.sena
        Dominio: .edu.co
        Ejemplo: angeldavidherrera@soy.sena.edu.co
        /* */
        Scanner elInput = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        var nombre = elInput.nextLine();
        System.out.println("Ingrese el nombre de la empresa:");
        var empresa = elInput.nextLine();
        System.out.println("Ingrese el dominio de la empresa(example:.com.co)");
        var dominio = elInput.nextLine();
        //vamos a pasar el nombre a miniscula nota: (angeldavidherrera)
        var nombreMinuscula = nombre.toLowerCase().replace(" ", "");
        //Empresa en miniscula (soy.sena)
        var empresaMinuscula = empresa.toLowerCase().replace(" ", ".");
        
        //metodo StringBuilder para unir dos cadenas
        var extensionDominio = new StringBuilder();
        extensionDominio.append(empresaMinuscula).append("").append(dominio);

        //metodo StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(nombreMinuscula).append("@").append(extensionDominio);
        //concatenamos todo para que se forme el correo
        var correoGenerado = (stringBuffer);
        //imprimimos todo
        System.out.println("Nombre Usuario: " +nombre);
        System.out.println("Nombre de la empresa: " +empresa);
        System.out.println("Correo Generado: " +correoGenerado);
        

        


        
    }
    
}
