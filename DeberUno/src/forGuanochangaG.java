public class forGuanochangaG {

    public void imprimirForLetraG(int tamano, String caracter) {
        int altura = tamano;
        int ancho = tamano - 1;
        if (tamano >= 5) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < tamano; j++) {
                    if ((i == 0 || i == altura - 1) && (j > 0 && j < ancho)) {
                        System.out.print(caracter);
                    } else if (j == 0 || (j == ancho && i >= altura / 2) || (i == altura / 2 && j > 0 && j < ancho)) {
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