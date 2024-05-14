public class forDavidD {

    public void imprimirForLetraD(int tamano, String caracter) {
        int ancho = tamano; // Ancho de la letra D basado en el tamaño dado

        if (tamano >= 5) {
            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < ancho; j++) {
                    if (j == 0 || (i == 0 && j < ancho - 1) || (i == tamano - 1 && j < ancho - 1)
                            || (j == ancho - 1 && i != 0 && i != tamano - 1)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El tamaño es muy pequeño!!!");
        }
        System.out.println();
        System.out.println();
    }
}