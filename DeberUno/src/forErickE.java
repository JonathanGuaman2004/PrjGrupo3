public class forErickE {
    public static void imprimirForLetraE(int tamano, String caracter) {
        System.out.println("De Erick Gualoto (For)");
            if (tamano>=5){
                for (int i = 1; i <= tamano; i++) {
                    if (i % 2 != 0) {
                        for (int j = 1; j <= tamano; j++) {
                            System.out.print(caracter);
                        }
                    } else {
                        for (int j = 1; j <= tamano / 2; j++) {
                            System.out.print(caracter);
                        }
                    }
                    System.out.println();
                }
            }
        }
}
