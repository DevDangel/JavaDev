import java.util.Random;
import java.util.Scanner;
public class adivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int numeroSecreto = random.nextInt(100)+1;
        
        int intento;
        boolean adivina = false;
        
            

        while(adivina) {
            System.out.println("Adivina el numero:");
            intento = input.nextInt();
        if (intento < numeroSecreto) {
            System.out.println("El numero es damasiado bajo"); 

        }else if(intento > numeroSecreto) {

            System.out.println("El numero es demasiado alto");
        }else {

            System.out.println("Excelente adivinaste el numero'\n'El numero era: " +numeroSecreto);    

        
    }
    }
        input.close();

    }


} 