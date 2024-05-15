public class whileJonathanJ {
    public static void imprimirWhileLetraJ(int tamano, String caracterI) {
        if (tamano>=5){
			int h=1;
			while (h<=tamano){
				if(h==1){
					int x=0;
					while(x<tamano){
						System.out.print(caracterI);
						x++;
					}
					System.out.println(" ");
				}
				if(h>1&&h<tamano){
					int y=0;
					while(y<(tamano/2)){
						System.out.print(" ");
						y++;
					}
					System.out.println(caracterI);
				}
				if(h==tamano){
					int y=0;
					while(y<(tamano/2)+1){
						System.out.print(caracterI);
						y++;
					}
				}
				h++;
			}
		}
		System.out.println(" ");
		System.out.println(" ");
    }
}
