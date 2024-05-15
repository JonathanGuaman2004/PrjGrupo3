public class doWhileErickE {
    public static void imprimirDoWhileLetraE(int tamano, String caracter) {
        System.out.println("De Erick Gualoto (Do While)");
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
                }
                System.out.println();
                i++;
            } while (i <= tamano);
        }
    }
}
