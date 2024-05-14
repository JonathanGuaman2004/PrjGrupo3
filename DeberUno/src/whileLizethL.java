public class whileLizethL {
    public void imprimirWhileLetraL (int tamano , String caracter){

        int anchoL = tamano/2;

        
        System.out.println("Impresion while letra L");
        int i = 0;
        while ( i < tamano) {
            i++;
            System.out.println(caracter);
        }

        int j=0;
        while (j < anchoL) {
            j++;
            System.out.print(caracter+ " ");
            
        }

        System.out.println();
    
    }

}
