package lesson16;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) throws InsufficientFundsException {
//        Car toyota = new Car("Toyota", 1000, 3);
//        Car lexus = new Car("lexus", 1000, 3);
//        Car mercedes = new Car("mercedes", 1000, 3);
//        Car honda = new Car("honda", 1000, 3);
//        Car bmw = new Car("bmw", 1000, 3);
//
//        Car[] a = new Car[5];
//
//        a[0]=toyota;
//        a[1]=lexus;
//        a[2]=mercedes;
//        a[3]=honda;
//        a[4]=bmw;
//
////        System.out.println(a[0]);
////        System.out.println(a[1]);
////        System.out.println(a[2]);
////        System.out.println(a[3]);
////        System.out.println(a[4]);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zehmet olmasa pulunuzu daxil edin");
//        int money = sc.nextInt();
//        if (money<100){
//                 throw new InsufficientFundsException("Sizin pulunuz yeterli deyil");
//        }
//    }


    public static void main(String[] args) throws MyExcheption {
        try {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number < 0) {
                throw new MyExcheption("Number menfi ola bilmez");
            }
        } catch (MyExcheption e) {
        }
    }
}
