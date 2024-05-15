import java.util.Scanner;

public class DoWhileJhojanZambranoJZ {
public void doWhileTamJZ(int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");
            return;
        }

        int i = 0;
        do {
            int j = 0;
            do {
                if (j == tam - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tam);
            System.out.print("  "); 

            if (i == 0) {
                j = 0;
                do {
                    System.out.print(caracter);
                    j++;
                } while (j < tam);
            } else {

                j = 0;
                do {
                    if (j == tam - 1 - i) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                } while (j < tam);
            }
            System.out.println();
            i++;
        } while (i < tam - 1);

        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tam);
        System.out.print("  "); 
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tam);
        System.out.println();
    }
}
