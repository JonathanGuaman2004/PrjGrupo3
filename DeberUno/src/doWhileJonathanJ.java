public class doWhileJonathanJ {
    public static void imprimirDoWhileLetraJ(int tamano, String caracterJ) {
        if (tamano>=5){
			int h=1;
			do{
				if(h==1){
					int x=0;
					do{
						System.out.print(caracterJ);
						x++;
					}while(x<tamano);
					System.out.println(" ");
				}
				if(h>1&&h<tamano){
					int y=0;
					do{
						System.out.print(" ");
						y++;
					}while(y<(tamano/2));
					System.out.println(caracterJ);
				}
				if(h==tamano){
					int y=0;
					do{
						System.out.print(caracterJ);
						y++;
					}while(y<(tamano/2)+1);
				}
				h++;
			}while (h<=tamano);
		}
		System.out.println(" ");
		System.out.println(" ");
    }
}
