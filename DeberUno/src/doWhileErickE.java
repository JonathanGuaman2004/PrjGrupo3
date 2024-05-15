public class doWhileErickE {
    public static void imprimirDoWhileLetraE(int tamano, String caracter) {
        System.out.println("De Erick Gualoto (Do While)");
        if (tamano >= 5) {
            int i = 1;
            do {
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
