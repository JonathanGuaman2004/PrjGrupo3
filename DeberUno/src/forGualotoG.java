public class forGualotoG {
    public static void imprimirForLetraG(int tamano, String caracter) {
        System.out.println("-------------------");
            if (tamano>=5){
                for (int i = 1; i <= tamano; i++) {
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
}