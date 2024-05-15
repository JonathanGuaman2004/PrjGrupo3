public class doWhileNayeliGualpaNG {
    String letra= "X";
    String vacio= " ";
    
    public void imprimirdoWhileLetraNG(int n){
        
        
        // xx    x    xxxx 
        // x x   x   x    
        // x  x  x   x  xxx
        // x   x x   x    x
        // x    x    xxxxxx 

       int i=1;

      do {
        System.out.print(letra);
        
        int a=1;
        do {
            System.out.print(vacio);  
            a++;
        }while (a<=i);
        System.out.print(letra);
        
        int d=1;
        do {
            System.out.print(vacio);  
            d++;
        }while (d<=n-i);
        System.out.print(letra);

        int c=1;
        do {
            System.out.print(vacio);
            c++;
        }while (c<=n/2);
       
        if (i==n) {
            System.out.print(vacio);
        }
        if (i==1) {
            System.out.print(vacio);
        }
        System.out.print(letra);  
           
        if (i==1) {
            int e=1;
            do {
                System.out.print(letra);  
                e++;
            }while (e<=n-2);
        }
       
        if (i==n) {
            int z=1;
            do {
                System.out.print(letra);  
                z++;
            }while (z<=n-2);
            }
           
        if (i ==n/2) {
            int z=1;
            do {
                System.out.print(vacio);  
                z++;
            }while (z<=n-i);
            
            
            int y=1;
            do {
                System.out.print(letra);  
                y++;
            } while (y<=n-i);
            System.out.println(letra);
            }
            

            
            
               
        if (i!=1 && i!= n && i!= n/2  ) {
            int y=1;
            do {
                System.out.print(vacio);  
                y++;
            } while (y<=n);
           
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