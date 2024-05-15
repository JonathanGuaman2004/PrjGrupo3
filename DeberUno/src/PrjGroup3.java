import java.util.Scanner;

public  class PrjGroup3{
    public static void main(String[] args) {
        //variables NO TOCAR, solo anadir las suyas
        Scanner ingresoDatos = new Scanner(System.in);
        String carac;
        int tamano;
        forJonathanJ aa;
        aa=new forJonathanJ();
        forGuamanG ab;
        ab=new forGuamanG();
        forJonathanGuamanJG ac;
        ac=new forJonathanGuamanJG();
        whileJonathanJ ba;
        ba=new whileJonathanJ();
        whileGuamanG bb;
        bb=new whileGuamanG();
        whileJonathanGuamanJG bc;
        bc=new whileJonathanGuamanJG();
        doWhileJonathanJ ca;
        ca=new doWhileJonathanJ();
        doWhileGuamanG cb;
        cb=new doWhileGuamanG();
        doWhileJonathanGuamanJG cc;
        cc=new doWhileJonathanGuamanJG();
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                      ESCUELA POLITECNICA NACIONAL");
        System.out.println("                                                  GRUPO 3");
        System.out.println("INTEGRANTES:");
        System.out.println("- Erick Gualoto");
        System.out.println("- Nayeli Gualpa");
        System.out.println("- Jonathan Guaman");
        System.out.println("- David Guanochanga");
        System.out.println("- Lizeth Hernandez");
        System.out.println("- Jhojan Zambrano");
        //anadirse
        System.out.println("Hola, este proyecto tiene el proposito de imprimir las letras iniciales de cada");
        System.out.println("uno de los participantes, la inicial del primer nombre, primer apellido y un ");
        System.out.println("conjunto de ambas; ademas, se utiliza diferentes maneras de realizar esta activdad");
        System.out.println("al aplicar las funciones de ciclos 'FOR', 'WHILE' y 'DO - WHILE'");
        System.out.println(" ");
        System.out.println("Es para ello que se requiere de el aporte de las maneras en que representar las iniciales");
        System.out.println(" ");
        System.out.println("Por favor a continuacion ingrese el tamano de las letras que desea");
        tamano = Integer.parseInt(ingresoDatos.nextLine());
        System.out.println("a continuacion elija el simbolo o caracter que desea utilizar para su representacion");
        carac=ingresoDatos.nextLine();
        System.out.println("De Jonathan Guaman");
        aa.imprimirForLetraJ(tamano, carac);
        ab.imprimirForLetraG(tamano, carac);
        ac.imprimirForLetrasJG(tamano, carac);
        ba.imprimirWhileLetraJ(tamano, carac);
        bb.imprimirWhileLetraG(tamano, carac);
        bc.imprimirWhileLetrasJG(tamano, carac);
        ca.imprimirDoWhileLetraJ(tamano, carac);
        cb.imprimirDoWhileLetraG(tamano, carac);
        cc.imprimirDoWhileLetrasJG(tamano, carac);


        //Llenar sus funciones con el mismo parametro
        System.out.println("De Erick Gualoto");
        System.out.println("De Nayeli Gualpa");
        System.out.println("De David Guanochanga");
        System.out.println("De Lizeth Hernandez");
        System.out.println("De Jhojan Zambrano");
    }
}