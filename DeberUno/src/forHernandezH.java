public class forHernandezH {
    public void imprimirForLetraH (int tamano , String caracter){
      
        int anchoH = tamano/2;  


        System.out.println("Impresion for letra H");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < anchoH; j++) {
                if (j == 0 || j == anchoH - 1 || i == tamano / 2) {
                    System.out.print(caracter+ " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
