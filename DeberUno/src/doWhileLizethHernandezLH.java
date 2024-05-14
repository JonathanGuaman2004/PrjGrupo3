public class doWhileLizethHernandezLH {

    public void imprimirDoWhileLetrasLH(int tamano , String caracter){

        System.out.println("Impresion do-while L y H");
        int i= 0;
        do {
            int j = 0;
            do {
                if (j==0 || i ==tamano-1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamano);

            System.out.print("  ");

            j= 0;

            do {
                if (j==0 || j== tamano-1 || i == tamano/2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamano);

            System.out.println();
            i++;
        } while (i < tamano);
    }
}
