import java.util.Scanner;

public class ForZambranoZ {
    public void forTamZ (int tam, String caracter) {

        if (tam < 4) {
            System.out.println("El tamaño ingresado debe ser mayor a 3");    
        }

        for (int i = 0; i < tam; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 1; i < tam - 1; i++) {
            for (int j = 0; j < tam; j++) {
                if (j == tam - 1 - i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < tam; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
    
}
