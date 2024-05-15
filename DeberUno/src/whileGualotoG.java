public class whileGualotoG {
    public static void imprimirWhileLetraG(int tamano, String caracter) {
        System.out.println("-------------------");
        if (tamano >= 5) {
            int i = 1;
            while (i <= tamano) {
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