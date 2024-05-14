public class whileGuanochangaG {

    public void imprimirWhileLetraG(int tamano, String caracter) {
        int altura = tamano;
        int ancho = tamano - 1;
        if (tamano >= 5) {
            int i = 0;
            while (i < altura) {
                int j = 0;
                while (j < tamano) {
                    if ((i == 0 || i == altura - 1) && (j > 0 && j < ancho)) {
                        System.out.print(caracter);
                    } else if (j == 0 || (j == ancho && i >= altura / 2) || (i == altura / 2 && j > 0 && j < ancho)) {
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