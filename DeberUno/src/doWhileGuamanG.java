public class doWhileGuamanG {
    public static void imprimirDoWhileLetraG(int tamano, String caracterJ) {
        if (tamano>=5){
			int h=1;
			do{
				if(h==1){
					int x=0;
					do{
						System.out.print(caracterJ);
						x++;
					}while (x<tamano);
					System.out.println(" ");
				}
				if (h>1&&h<(tamano/2)+1) {
					System.out.println(caracterJ);
				}
				if(h==(tamano/2)+1) {
					int w=2;
					int r=(tamano/2)+1;
					System.out.print(caracterJ);
					do{
						System.out.print(" ");
						w++;
					}while(w<(tamano/2)+1);
					do{
						System.out.print(caracterJ);
						r++;
					}while(r<(tamano));
					System.out.println(caracterJ);
				}
				if((h>(tamano/2)+1)&&(h<tamano)) {
					int r=2;
					System.out.print(caracterJ);
					do{
						System.out.print(" ");
						r++;
					}while(r<(tamano));
					System.out.println(caracterJ);
				}
				if(h==tamano){
					int y=0;
					do{
						System.out.print(caracterJ);
						y++;
					}while(y<(tamano));
				}
				h++;
			}while(h<=tamano);
		}
		System.out.println(" ");
		System.out.println(" ");
    }
}
