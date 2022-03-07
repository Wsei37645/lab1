package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        
	    System.out.println("Hello Java World");
        System.out.println("------------------------------------");

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");
        System.out.println("------------------------------------");

        int a=3;
        double b=4.21;
        String s="jakiś tekst ";
        System.out.printf("a=%d, b=%.2f, s=%20s %n",a,b,s);
        System.out.println("------------------------------------");

        System.out.print("Nazywaliśmy to \"witaminą B3\" \n");
        System.out.println("------------------------------------");

        System.out.printf("alfa\tsin(alfa) \n");
        for (int i=0; i<370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        System.out.println("------------------------------------");

        int x=0;
        System.out.println("arg|\tlog2(arg)|\tsum(arg)\n");
        for (int arg=1; arg<9; arg++) {

            System.out.printf( " %d |\t %f|\t%d\t\n",arg, Math.log(arg) / Math.log(2), x+=arg );
        }
        System.out.println("------------------------------------");

        Scanner input = new Scanner (System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            System.out.print("Podaj drugą liczbę: ");
            num2= input.nextInt();
            if ((num1 ==  0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1+num2 ) ;
        } while (true);
        System.out.println("------------------------------------");

        int DEC;
        System.out.print("Podaj liczbę binarną: ");
        DEC= input.nextInt();
        System.out.printf("DEC= %d, BIN= %s, HEX =0x%S", DEC, Integer.toBinaryString(DEC), Integer.toHexString(DEC));
    }

}
