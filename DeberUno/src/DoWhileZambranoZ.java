import java.util.Scanner;

public class DoWhileZambranoZ {
    public void doWhileTamZ(int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");
            return;  
        }

        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tam);
        System.out.println();

        i = 1;
        do {
            int j = 0;
            do {
                if (j == tam - 1 - i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tam);
            System.out.println();
            i++;
        } while (i < tam - 1);

        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tam);
        System.out.println();
    }
}
