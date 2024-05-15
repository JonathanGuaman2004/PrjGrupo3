import java.util.Scanner;

public class WhileJhojanZambranoJZ {
    public void whileTamJZ(int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");
            return;
        }

        int i = 0;
        while (i < tam - 1) {
            int j = 0;
            while (j < tam) {
                if (j == tam - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print("  "); 

            j = 0;
            if (i == 0) {
                while (j < tam) {
                    System.out.print(caracter);
                    j++;
                }
            } else {
                while (j < tam) {
                    if (j == tam - 1 - i) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            System.out.println();
            i++;
        }

        i = 0;
        while (i < tam) {
            System.out.print(caracter);
            i++;
        }
        System.out.print("  "); 
        i = 0;
        while (i < tam) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();
    }
}