public class whileGualpaG {

    String letra= "X";
    String vacio= " ";
   
    public void imprimirWhileLetraG(int n){

        //  xxxx 
        // x    
        // x  xxx
        // x    x
        //  xxxxx 

        int i=1;

       while(i<=n){
        if (i==n) {
            System.out.print(vacio);
        }
        if (i==1) {
            System.out.print(vacio);
        }
           System.out.print(letra);
           
        if (i==1) {
            int b=1;
            while (b<=n-2) {
            System.out.print(letra);
                b++;
                }
            
            }

        
        if (i==n) {
            int b=1; 
            while (b<=n-2) {
                System.out.print(letra);
                    b++;
                }
            }
           
        if (i ==n/2) {

            int b=1; 
            while (b<=n-i) {
                System.out.print(vacio);
                    b++;
                }

            int c=1;  
            while (c<=n-i) {
                    System.out.print(letra);
                        c++;
                    }


            System.out.println(letra);
                }
               


        if (i!=1 && i!= n && i!= n/2  ) {
            int b=1; 
            while (b<=n) {
                System.out.print(vacio);
                    b++;
                }
           
        }

         if (i < n/2 && i!= n/2) {
             System.out.println(vacio);
         }
        
         if (i >=n/2 && i!= n/2) {

             System.out.println(letra);
         }

         i++;
    }
   }
}

