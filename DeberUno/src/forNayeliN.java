public class forNayeliN {

    String letra= "X";
    String vacio= " ";
public  void imprimirForLetraN(int n){

    // XXXX    XX
    // XX XX   XX
    // XX  XX  XX
    // XX   XX XX 
    // XX    XXXX
    // XX     XX

    for(int i=1; i<=n; i++){
        System.out.print(letra);
        System.out.print(letra);

            for(int a=1; a<=i; a++)
            System.out.print(vacio);
            System.out.print(letra);
            System.out.print(letra);

            for(int a=1; a<=n-i; a++)
            System.out.print(vacio);
            System.out.print(letra);
            
           
        System.out.println(letra);
}    


}
}
