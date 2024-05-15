public class doWhileHernandezH {
    public void imprimirDoWhileLetraH(int tamano , String caracter){

        int anchoH = tamano/2;

        System.out.println("Impresion do-while letra H");
        int i =0;
        do {
            int j= 0;
            do {
                if (j==0 || j == anchoH-1 || i == tamano/2) {
                    System.out.print(caracter+ " ");
                }else{
                    System.out.print("  ");
                }
                j++;
            } while (j < anchoH);
            System.out.println();
            i++;
        } while (i < tamano);
    }

}
