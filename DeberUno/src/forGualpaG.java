public class forGualpaG {

    String letra= "X";
    String vacio= " ";
   
    public void imprimirForLetraG(int n){

        //  xxxx 
        // x    
        // x  xxx
        // x    x
        //  xxxxx 

        System.out.print(vacio);
        
       for(int i=1; i<=n; i++){
        if (i==n) {
            System.out.print(vacio);
        }
           System.out.print(letra);
           
        if (i==1) {
            for(int b=1; b<=n-2; b++)
            System.out.print(letra);
            }
     
        if (i==n) {
            for(int b=1; b<=n-2; b++)
            System.out.print(letra);
            }
           
        if (i ==n/2) {
            for(int b=1; b<=n-i; b++)
            System.out.print(vacio);

            for(int b=1; b<=n-i; b++)
            System.out.print(letra);

            System.out.println(letra);
                }
               

        if (i!=1 && i!= n && i!= n/2  ) {
        for(int b=1; b<=n; b++)
        System.out.print(vacio);
           
        }

         if (i < n/2 && i!= n/2) {
             System.out.println(vacio);
         }
        
         if (i >=n/2 && i!= n/2) {

             System.out.println(letra);
         }

    }
   }
}