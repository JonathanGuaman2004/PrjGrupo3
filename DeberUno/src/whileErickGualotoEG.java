public class whileErickGualotoEG {
    public static void imprimirWhileLetraEG(int tamano, String caracter) {
        System.out.println("-------------------");
        if (tamano >= 5) {
            int i = 1;
            while (i <= tamano) {
                if (i % 2 != 0) {
                    int j = 1;
                    while (j <= tamano) {
                        System.out.print(caracter);
                        j++;
                    }
                } else {
                    int j = 1;
                    while (j <= tamano / 2) {
                        System.out.print(caracter);
                        j++;
                    }
                    // Calcular el número de espacios en blanco restantes
                    int espaciosBlanco = tamano - (tamano / 2);
                    int k = 1;
                    while (k <= espaciosBlanco) {
                        System.out.print(" ");
                        k++;
                    }
                }
                
                System.out.print(" "); 
                
                if (i == 1 || i == tamano || i == tamano / 2 + 1) {
                    int j = 1;
                    while (j <= tamano) {
                        System.out.print(caracter);
                        j++;
                    }
                } else if (i > tamano / 2 + 1) {
                    System.out.print(caracter);
                    int j = 1;
                    while (j <= tamano - 2) {
                        System.out.print(" ");
                        j++;
                    }
                    System.out.print(caracter);
                } else {
                    System.out.print(caracter);
                }
                
                System.out.println();
                i++;
            }
        }
    }
}