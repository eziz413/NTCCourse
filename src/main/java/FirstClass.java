import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {


        /*
        Beden kutle indeksinin hesablanmasi:
        1. Adinizi daxil edin.
        2. soyadinizi daxil edin .
        3 Boyunuzu daxil edin sm ile.
        4.Chekinizi daxil edin kq ile.
        5.beden kutle indeksini hesablayin boy/cheki.
        6. result - neticeni chapa verek.

         */


        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 ci ededi daxil edin");
        double a =sc.nextDouble();
        System.out.println(" 2 ci ededi daxil edin");
        double b = sc.nextDouble();
        System.out.println("Zehemet olmasa adinizi daxil edin");
        sc.nextLine();
        String c = sc.nextLine();


        System.out.println("Result = "+(a/b));
        System.out.println(c);


    }

}

