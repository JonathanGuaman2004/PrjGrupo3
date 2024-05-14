public class doWhileDavidD {

    public void imprimirDoWhileLetraD(int tamano, String caracter) {
        int ancho = tamano; // Ancho de la letra D basado en el tamaño dado

        if (tamano >= 5) {
            int i = 0;
            do {
                int j = 0;
                do {
                    if (j == 0 || (i == 0 && j < ancho - 1) || (i == tamano - 1 && j < ancho - 1)
                            || (j == ancho - 1 && i != 0 && i != tamano - 1)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                } while (j < ancho);
                System.out.println();
                i++;
            } while (i < tamano);
        } else {
            System.out.println("El tamaño es muy pequeño!!!");
        }
        System.out.println();
        System.out.println();
    }
}