public class forLizethHernandezLH {
    public void imprimirForLetrasLH(int tamano , String caracter){
        int ancho = tamano/2; 


        System.out.println("Impresión for L y H");
        for (int i = 0; i < tamano; i++) {
            
            for (int j = 0; j < ancho; j++) {
                if (j == 0 || i == tamano - 1) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < ancho; j++) {
                if (j == 0 || j == ancho - 1 || i == tamano / 2) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }


}
