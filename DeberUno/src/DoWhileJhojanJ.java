import java.util.Scanner;

public class DoWhileJhojanJ {

    public void doWhileTamJ(int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");
        }

        int contador = 0;

        int i = 0;
        do {
            System.out.print(" ");
            i++;
        } while (i < tam - 1);
        System.out.println(caracter);
        contador++;

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < tam - 1);
            System.out.println(caracter);
            contador++;
            i++;
        } while (i < tam - 2);

        i = 0;
        do {
            System.out.print(caracter);
            contador++;
            i++;
        } while (i < tam - 1);
        System.out.println(caracter);
        contador++;
    }
}
