package lesson6;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {


        /*
        switch(operation durum1){
        case durum1:
        emeliyyatlar
        break
        case durum2:
        emeliyyatlar
        break
        //
        //
        default:
        emeliyyatlar:
        break
         */

        /*
        Scanner ile 2 eded daxil edib bu ededlerin swich-case ile
        toplama,chixma,vurma,bolme emeliyyatlarini yerine yetirin.
        emeliyyatlari *,/,+,- simvollari ile yerine yetireceksiniz.
         */
        Scanner sc = new Scanner(System.in);
        int emeliyyat = sc.nextInt();
        switch (emeliyyat){
            case 1:
                System.out.println("1 ci emeliyyat=");
                break;
            case 2:
                System.out.println("2 ci emeliyyat");
                break;
            case 3:
                System.out.println("3 cu emeliyyat");
                break;
            case 4:
                System.out.println("4 cu emeliyyat");
                break;
            default:
                System.out.println("yanlish emeliyyat");
        }
    }
}
