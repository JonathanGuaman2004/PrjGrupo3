public class doWhileDavidGuanochangaDG {

    public void imprimirDoWhileLetraDG(int tamano, String caracter) {
        int anchoD = tamano; // Ancho de la letra D basado en el tamaño dado
        int alturaG = tamano;
        int anchoG = tamano - 1;

        if (tamano >= 5) {
            int i = 0;
            do {
                // Imprimir la letra D
                int j = 0;
                do {
                    if (j == 0 || (i == 0 && j < anchoD - 1) || (i == tamano - 1 && j < anchoD - 1)
                            || (j == anchoD - 1 && i != 0 && i != tamano - 1)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                } while (j < anchoD);
                // Espacio entre las letras D y G
                System.out.print(" ");

                // Imprimir la letra G
                j = 0;
                do {
                    if ((i == 0 || i == alturaG - 1) && (j > 0 && j < anchoG)) {
                        System.out.print(caracter);
                    } else if (j == 0 || (j == anchoG && i >= alturaG / 2)
                            || (i == alturaG / 2 && j > 0 && j < anchoG)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                } while (j < tamano);
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