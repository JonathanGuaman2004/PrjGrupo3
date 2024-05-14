public class forLizethL {
    public void imprimirForLetraL(int tamano, String caracter){
        
        int anchoL = tamano/2;
        
        System.out.println("Impresion for letra L");
        for (int i = 0; i < tamano; i++) {
            System.out.println(caracter);
        }
        
        for (int j = 0; j < anchoL; j++) {
            System.out.print(caracter+ " ");
        }
        
        System.out.println();
    
    }
}
