public class doWhileErickGualotoEG {
    public static void imprimirDoWhileLetraEG(int tamano, String caracter) {
        System.out.println("-------------------");
        if (tamano >= 5) {
            int i = 1;
            do {
                if (i % 2 != 0) {
                    int j = 1;
                    do {
                        System.out.print(caracter);
                        j++;
                    } while (j <= tamano);
                } else {
                    int j = 1;
                    do {
                        System.out.print(caracter);
                        j++;
                    } while (j <= tamano / 2);
                    // Calcular el número de espacios en blanco restantes
                    int espaciosBlanco = tamano - (tamano / 2);
                    int k = 1;
                    do {
                        System.out.print(" ");
                        k++;
                    } while (k <= espaciosBlanco);
                }
                
                System.out.print(" "); 
                
                if (i == 1 || i == tamano || i == tamano / 2 + 1) {
                    int j = 1;
                    do {
                        System.out.print(caracter);
                        j++;
                    } while (j <= tamano);
                } else if (i > tamano / 2 + 1) {
                    System.out.print(caracter);
                    int j = 1;
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j <= tamano - 2);
                    System.out.print(caracter);
                } else {
                    System.out.print(caracter);
                }
                
                System.out.println();
                i++;
            } while (i <= tamano);
        }
    }
}