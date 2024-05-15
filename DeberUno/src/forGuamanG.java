public class forGuamanG {
    public static void imprimirForLetraG(int tamano, String caracter) {
        if (tamano>=5){
			for(int h=1;h<=tamano;h++){
				if(h==1){
					for(int x=0;x<tamano;x++){
						System.out.print(caracter);
					}
					System.out.println(" ");
				}
				if (h>1&&h<(tamano/2)+1) {
					System.out.println(caracter);
				}
				if(h==(tamano/2)+1) {
					System.out.print(caracter);
					for(int w=2;w<(tamano/2)+1;w++) {
						System.out.print(" ");
					}
					for(int r=(tamano/2)+1;r<(tamano);r++) {
						System.out.print(caracter);
					}
					System.out.println(caracter);
				}
				if((h>(tamano/2)+1)&&(h<tamano)) {
					System.out.print(caracter);
					for(int r=2;r<(tamano);r++) {
						System.out.print(" ");
					}
					System.out.println(caracter);
				}
				if(h==tamano){
					for(int y=0;y<(tamano);y++){
						System.out.print(caracter);
					}
				}
			}
		}
        System.out.println(" ");
        System.out.println(" ");
    }
}
