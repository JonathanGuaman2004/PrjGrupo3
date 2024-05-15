public class whileLizethHernandezLH {
    public void imprimirWhileLetrasLH(int tamano , String caracter){
        

        System.out.println("Impresion while L y H");
        int i = 0;
        while (i < tamano) {
            int j = 0;
            while (j < tamano) {
                if (j == 0 || i == tamano -1) {
                    System.out.print(caracter);
                    
                } else {
                    System.out.print(" ");
                    
                }
                j++;
            }
            
            System.out.print("  ");

            j= 0;
            while (j < tamano) {
                if (j==0 || j == tamano -1 || i == tamano/2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println();
            i++;
        }


    }

}
