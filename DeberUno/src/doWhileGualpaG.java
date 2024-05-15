public class doWhileGualpaG {
    String letra= "X";
    String vacio= " ";
   
    public void imprimirdoWhileLetraG(int n){
        //  xxxx 
        // x    
        // x  xxx
        // x    x
        //  xxxxx 
 
        int i = 1;

      do {

        if (i==n) {
            System.out.print(vacio);
        }
        if (i==1) {
            System.out.print(vacio);
        }
           System.out.print(letra);
           
        if (i==1) {
            int b=1;
            do {
            System.out.print(letra);
                b++;
                }while (b<=n-2);
            
            }

        
        if (i==n) {
            int b=1; 
            do {
                System.out.print(letra);
                    b++;
                }while (b<=n-2);
            }
           
        if (i ==n/2) {

            int b=1; 
            do {
                System.out.print(vacio);
                    b++;
                }while (b<=n-i);

            int c=1;  
            do {
                    System.out.print(letra);
                        c++;
                    }while (c<=n-i) ;


            System.out.println(letra);
                }
               


        if (i!=1 && i!= n && i!= n/2  ) {
            int b=1; 
            do {
                System.out.print(vacio);
                    b++;
                }while (b<=n);           
        }

    
         if (i < n/2 && i!= n/2) {
             System.out.println(vacio);
         }
        
         if (i >=n/2 && i!= n/2) {

             System.out.println(letra);
         }
          
     i++;     
    } while(i<=n);
   }
}
