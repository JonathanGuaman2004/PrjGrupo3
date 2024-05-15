public class doWhileLizethL {

    public void imprimirDoWhileLetraL(int tamano , String caracter){
        
        int anchoL = tamano/2;

        System.out.println("Impresion do-while letra L");
        int i = 0;
        do {
            System.out.println(caracter);
            i++;
        } while (i < tamano);

        int j = 0;
        do {
            System.out.print(caracter+ " ");
            j++;
        } while (j < anchoL);
        System.out.println();
    }
}
