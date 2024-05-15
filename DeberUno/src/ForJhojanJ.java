import java.util.Scanner;

public class ForJhojanJ {

    public void forTamJ (int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");    
        }
        
        int contador = 0;

        for (int i = 0; i < tam - 1; i++) {
            System.out.print(" ");
        }
        System.out.println(caracter);
        contador++;

       
        for (int i = 0; i < tam - 2; i++) {
            for (int j = 0; j < tam - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(caracter);
            contador++;
        }

        for (int i = 0; i < tam - 1; i++) {
            System.out.print(caracter);
            contador++;
        }
        System.out.println(caracter); 
        contador++;
    }

}
