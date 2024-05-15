public class whileNayeliN {

     // XXXX    XX
    // XX XX   XX
    // XX  XX  XX
    // XX   XX XX 
    // XX    XXXX
    // XX     XX
    
    int i=0;
    String letra="X";
    String vacio=" ";

    public void imprimirWhileLetraN (int n) {
        
        while (i < n) {
            int j = 0;
            while (j <= n) {
                if (j == 0 || j == n  || i == j || i == n )
                    System.out.print(letra); 
                else
                    System.out.print(vacio); 
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
