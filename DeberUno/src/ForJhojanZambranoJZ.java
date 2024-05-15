import java.util.Scanner;

public class ForJhojanZambranoJZ {
    public void forTamJZ (int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");
            return;
        }

        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam; j++) {
                if (j == tam - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 

            if (i == 0) {
                for (int j = 0; j < tam; j++) {
                    System.out.print(caracter);
                }
            } else {
                for (int j = 0; j < tam; j++) {
                    if (j == tam - 1 - i) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
       
        for (int i = 0; i < tam; i++) {
            System.out.print(caracter);
        }
        System.out.print("  "); 
        for (int i = 0; i < tam; i++) {
            System.out.print(caracter);
        }
        System.out.println();

    }
}
