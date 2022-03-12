package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        /*
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
        System.out.printf("DEC= %d, BIN= %s, HEX =0x%S\n", DEC, Integer.toBinaryString(DEC), Integer.toHexString(DEC));
        System.out.println("------------------------------------");

        int[] liczby = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < 30; i++)
            liczby [i] = rnd.nextInt();
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;

        for (int l : liczby){

            System.out.println(l);
            if (l < mn) mn = l;
            if (l > mx) mx = l;
            avg += l;
        }
            System.out.printf ("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float)avg/liczby.length);

         */
        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
    }

}
