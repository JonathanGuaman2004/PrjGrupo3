import java.util.Scanner;

public class PrjGroup3 {
    public static void main(String[] args) {
        // variables NO TOCAR, solo anadir las suyas
        Scanner ingresoDatos = new Scanner(System.in);
        String carac;
        int tamano;
        forJonathanJ aa;
        aa = new forJonathanJ();
        forGuamanG ab;
        ab = new forGuamanG();
        forJonathanGuamanJG ac;
        ac = new forJonathanGuamanJG();
        whileJonathanJ ba;
        ba = new whileJonathanJ();
        whileGuamanG bb;
        bb = new whileGuamanG();
        whileJonathanGuamanJG bc;
        bc = new whileJonathanGuamanJG();
        doWhileJonathanJ ca;
        ca = new doWhileJonathanJ();
        doWhileGuamanG cb;
        cb = new doWhileGuamanG();
        doWhileJonathanGuamanJG cc;
        cc = new doWhileJonathanGuamanJG();


        forLizethL fl = new forLizethL();
        forHernandezH fh = new forHernandezH();
        forLizethHernandezLH flh = new forLizethHernandezLH();
        whileLizethL wl = new whileLizethL();
        whileHernandezH wh = new whileHernandezH();
        whileLizethHernandezLH wlh = new whileLizethHernandezLH();
        doWhileLizethL dl = new doWhileLizethL();
        doWhileHernandezH dh = new doWhileHernandezH();
        doWhileLizethHernandezLH dlh = new doWhileLizethHernandezLH();

        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                      ESCUELA POLITECNICA NACIONAL");
        System.out.println("                                                  GRUPO 3");
        System.out.println("INTEGRANTES:");
        System.out.println("- Erick Gualoto");
        System.out.println("- Nayeli Gualpa");
        System.out.println("- Jonathan Guaman");
        System.out.println("- David Guanochanga");
        System.out.println("- Lizeth Hernandez");
        System.out.println("- Jhojan Zambrano");
        // anadirse
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
        carac = ingresoDatos.nextLine();
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

        // Llenar sus funciones con el mismo parametro
        System.out.println("De Erick Gualoto");
        System.out.println("De Nayeli Gualpa");
          //n=8 : Parametro base para todos los bucles 
          int n= 9;
        
          //For
          System.out.println( "-----------For-------------");
          System.out.println();
  
              forNayeliN fN;
              fN= new forNayeliN();
              fN.imprimirForLetraN(n); 
              System.out.println();
  
              forGualpaG fG;
              fG= new forGualpaG();
              fG.imprimirForLetraG(n);
              System.out.println();
  
              forNayeliGualpaNG fNG;
              fNG= new forNayeliGualpaNG();
              fNG.imprimirForLetraNG(n);
              System.out.println();
  
          //While
          System.out.println("----------While-------------");
          System.out.println();
  
               whileNayeliN  wN;
               wN= new whileNayeliN();
               wN.imprimirWhileLetraN(n);
               System.out.println();
  
               whileGualpaG  wG;
               wG= new whileGualpaG();
               wG.imprimirWhileLetraG(n);
               System.out.println();
  
               whileNayeliGualpaNG  wNG;
               wNG= new whileNayeliGualpaNG();
               wNG.imprimirWhileLetraNG(n);
               System.out.println();
  
          //Do-While
          System.out.println("-----------Do-While-----------");
          System.out.println();
  
                doWhileNayeliN  dN;
                dN=new doWhileNayeliN();
                dN.imprimirdoWhileLetraN(n);
                System.out.println();
                
                doWhileGualpaG  dG;
                dG=new doWhileGualpaG();
                dG.imprimirdoWhileLetraG(n);
                System.out.println();
  
                doWhileNayeliGualpaNG dNG;
                dNG=new doWhileNayeliGualpaNG();
                dNG.imprimirdoWhileLetraNG(n);
                System.out.println();
        System.out.println("De David Guanochanga");
        System.out.println(" --- FOR ---");
        System.out.println();

        forDavidD fd = new forDavidD();
        fd.imprimirForLetraD(tamano, carac);

        forGuanochangaG fg = new forGuanochangaG();
        fg.imprimirForLetraG(tamano, carac);

        forDavidGuanochangaDG fdg = new forDavidGuanochangaDG();
        fdg.imprimirForLetraDG(tamano, carac);

        System.out.println(" --- WHILE ---");
        System.out.println();

        whileDavidD wd = new whileDavidD();
        wd.imprimirWhileLetraD(tamano, carac);

        whileGuanochangaG wg = new whileGuanochangaG();
        wg.imprimirWhileLetraG(tamano, carac);

        whileDavidGuanochangaDG wdg = new whileDavidGuanochangaDG();
        wdg.imprimirWhileLetraDG(tamano, carac);

        System.out.println(" --- DO-WHILE ---");
        System.out.println();

        doWhileDavidD dwd = new doWhileDavidD();
        dwd.imprimirDoWhileLetraD(tamano, carac);

        doWhileGuanochangaG dwg = new doWhileGuanochangaG();
        dwg.imprimirDoWhileLetraG(tamano, carac);

        doWhileDavidGuanochangaDG dwDG = new doWhileDavidGuanochangaDG();
        dwDG.imprimirDoWhileLetraDG(tamano, carac);

        System.out.println("De Lizeth Hernandez");
        fl.imprimirForLetraL(tamano , carac);
        fh.imprimirForLetraH(tamano , carac);
        flh.imprimirForLetrasLH(tamano , carac);
        wl.imprimirWhileLetraL(tamano , carac);
        wh.imprimirWhileLetraH(tamano , carac);
        wlh.imprimirWhileLetrasLH(tamano , carac);
        dl.imprimirDoWhileLetraL(tamano , carac);
        dh.imprimirDoWhileLetraH(tamano , carac);
        dlh. imprimirDoWhileLetrasLH(tamano , carac);


        System.out.println("De Jhojan Zambrano");
        ForJhojanJ ij;
        ij = new ForJhojanJ();
        ij.forTamJ(tamano, carac);

        ForZambranoZ iz;
        iz = new ForZambranoZ();
        iz.forTamZ(tamano, carac);

        ForJhojanZambranoJZ ijz;
        ijz = new ForJhojanZambranoJZ();
        ijz.forTamJZ(tamano, carac);

        WhileJhojanJ wj;
        wj = new WhileJhojanJ();
        wj.whileTamJ(tamano, carac);

        WhileZambranoZ wz;
        wz = new WhileZambranoZ();
        wz.whileTamZ(tamano, carac);
        
        WhileJhojanZambranoJZ wjz;
        wjz = new WhileJhojanZambranoJZ();
        wjz.whileTamJZ(tamano, carac);

        DoWhileJhojanJ dwj;
        dwj = new DoWhileJhojanJ();
        dwj.doWhileTamJ(tamano, carac);

        DoWhileZambranoZ dwz;
        dwz = new DoWhileZambranoZ();
        dwz.doWhileTamZ(tamano, carac);

        DoWhileJhojanZambranoJZ dwjz;
        dwjz = new DoWhileJhojanZambranoJZ();
        dwjz.doWhileTamJZ(tamano, carac);
    }
}