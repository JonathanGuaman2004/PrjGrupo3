public class whileDavidD {

    public void imprimirWhileLetraD(int tamano, String caracter) {
        int ancho = tamano; // Ancho de la letra D basado en el tamaño dado

        if (tamano >= 5) {
            int i = 0;
            while (i < tamano) {
                int j = 0;
                while (j < ancho) {
                    if (j == 0 || (i == 0 && j < ancho - 1) || (i == tamano - 1 && j < ancho - 1)
                            || (j == ancho - 1 && i != 0 && i != tamano - 1)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
                System.out.println();
                i++;
            }
        } else {
            System.out.println("El tamaño es muy pequeño!!!");
        }
        System.out.println();
        System.out.println();
    }
}