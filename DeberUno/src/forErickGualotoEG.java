public class forErickGualotoEG {
    public static void imprimirForLetraEG(int tamano, String caracter) {
        System.out.println("-------------------");
        for (int i = 1; i <= tamano; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= tamano; j++) {
                    System.out.print(caracter);
                }
            } else {
                for (int j = 1; j <= tamano / 2; j++) {
                    System.out.print(caracter);
                }
                // Calcular el número de espacios en blanco restantes
                int espaciosBlanco = tamano - (tamano / 2) ;
                for (int j = 1; j <= espaciosBlanco; j++) {
                    System.out.print(" ");
                }
            }
           
            System.out.print(" "); 

            if (i == 1 || i == tamano || i == tamano / 2 + 1) {
                for (int j = 1; j <= tamano; j++) {
                    System.out.print(caracter);
                }
            } else if (i > tamano / 2 + 1) {
                System.out.print(caracter);
                for (int j = 1; j <= tamano - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);
            } else {
                System.out.print(caracter);
            }
            System.out.println();
        }
            
    }
}