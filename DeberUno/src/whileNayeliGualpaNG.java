public class whileNayeliGualpaNG {
    String letra= "X";
    String vacio= " ";
    
    public void imprimirWhileLetraNG(int n){
        
        // xx    x    xxxx 
        // x x   x   x    
        // x  x  x   x  xxx
        // x   x x   x    x
        // x    x    xxxxxx 

       int i=1;

       while(i<=n){
        System.out.print(letra);
        
        int a=1;
        while (a<=i) {
            System.out.print(vacio);  
            a++;
        }
        System.out.print(letra);
        
        int d=1;
        while (d<=n-i) {
            System.out.print(vacio);  
            d++;
        }
        System.out.print(letra);

        int c=1;
        while (c<=n/2) {
            System.out.print(vacio);
            c++;
        }
       
        if (i==n) {
            System.out.print(vacio);
        }
        if (i==1) {
            System.out.print(vacio);
        }
        System.out.print(letra);  
           
        if (i==1) {
            int e=1;
            while (e<=n-2) {
                System.out.print(letra);  
                e++;
            }
        }
       
        if (i==n) {
            int z=1;
            while (z<=n-2) {
                System.out.print(letra);  
                z++;
            }
            }
           
        if (i ==n/2) {
            int z=1;
            while (z<=n-i) {
                System.out.print(vacio);  
                z++;
            }
            
            
            int y=1;
            while (y<=n-i) {
                System.out.print(letra);  
                y++;
            } 
            System.out.println(letra);
            }
            

            
            
               
        if (i!=1 && i!= n && i!= n/2  ) {
            int y=1;
            while (y<=n) {
                System.out.print(vacio);  
                y++;
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