public class forJonathanJ {
    public static void imprimirForLetraJ(int tamano, String caracter) {
        if (tamano>=5){
			for(int h=1;h<=tamano;h++){
				if(h==1){
					for(int x=0;x<tamano;x++){
						System.out.print(caracter);
					}
					System.out.println(" ");
				}
				if(h>1&&h<tamano){
					for(int y=0;y<(tamano/2);y++){
						System.out.print(" ");
					}
					System.out.println(caracter);
				}
				if(h==tamano){
					for(int y=0;y<(tamano/2)+1;y++){
						System.out.print(caracter);
					}
				}
			}
		}
        System.out.println(" ");
        System.out.println(" ");
    }
}
