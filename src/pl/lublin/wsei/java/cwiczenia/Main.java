package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello Java World");

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");


        int a=3;
        double b=4.21;
        String s="jakiś tekst ";

        System.out.printf("a=%d, b=%.2f, s=%20s %n",a,b,s);

        System.out.print("Nazywaliśmy to \"witaminą B3\" \n");

        System.out.printf("alfa\tsin(alfa) \n");
        for (int i=0; i<370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));


    }
}
