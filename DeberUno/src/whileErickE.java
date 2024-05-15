public class whileErickE {
    public static void imprimirWhileLetraE(int tamano, String caracter) {
        System.out.println("De Erick Gualoto (While)");
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
                }
                System.out.println();
                i++;
            }
        }
    }
}
