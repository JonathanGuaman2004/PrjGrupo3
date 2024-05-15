public class whileJonathanGuamanJG {
    public static void imprimirWhileLetrasJG(int tamano, String caracterI) {
        if (tamano>=5){
			int h=1;
			while(h<=tamano){
				if(h==1){
					int x=0;
					while(x<tamano){
						System.out.print(caracterI);
						x++;
					}
					if((tamano%2)==0) {
						System.out.print("  ");
					}else {
						System.out.print(" ");
					}
					x=0;
					while(x<tamano){
						System.out.print(caracterI);
						x++;
					}
					System.out.println(" ");
				}
				if (h>1&&h<(tamano/2)+1) {
					int y=0;
					while(y<(tamano/2)){
						System.out.print(" ");
						y++;
					}
					y=0;
					System.out.print(caracterI);
					while(y<(tamano/2)+1){
						System.out.print(" ");
						y++;
					}
					System.out.println(caracterI);
				}
				if(h==(tamano/2)+1) {
					int y=0;
					while(y<(tamano/2)){
						System.out.print(" ");
						y++;
					}
					System.out.print(caracterI);
					y=0;
					while(y<(tamano/2)+1){
						System.out.print(" ");
						y++;
					}
					System.out.print(caracterI);
					int w=2;
					while(w<(tamano/2)+1){
						System.out.print(" ");
						w++;
					}
					int r=(tamano/2)+1;
					while(r<(tamano)){
						System.out.print(caracterI);
						r++;
					}
					System.out.println(caracterI);
				}
				if((h>(tamano/2)+1)&&(h<tamano)) {
					int y=0;
					while(y<(tamano/2)){
						System.out.print(" ");
						y++;
					}
					System.out.print(caracterI);
					y=0;
					while(y<(tamano/2)+1){
						System.out.print(" ");
						y++;
					}
					System.out.print(caracterI);
					int r=2;
					while(r<(tamano)){
						System.out.print(" ");
						r++;
					}
					System.out.println(caracterI);
				}
				if(h==tamano){
					int y=0;
					while(y<(tamano/2)+1){
						System.out.print(caracterI);
						y++;
					}
					y=0;
					while(y<(tamano/2)+1){
						System.out.print(" ");
						y++;
					}
					y=0;
					while(y<(tamano)){
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
