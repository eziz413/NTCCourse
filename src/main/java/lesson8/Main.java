package lesson8;

public class Main {


    public static void test1(int a, String b) {
        System.out.println(a + b);
    }

    public static  void test1(int a,String b,boolean s){

    }
    public static void test1(int a) {
        System.out.println(" a deyisheni daxil edildi");
    }


    public static void test1(){
        System.out.println("Parametrsiz method");
    }

    public static void main(String[] args) {


        test1(14, " dhgjhg");
        test1();
        test1(17);

    }
}
