package lesson18;

public class Main {

    public static void main(String[] args) {
        Thread printer1 = new Thread(new Printer("printer1"));
        Thread printer2 = new Thread(new Printer("printer2"));
        Thread printer3 = new Thread(new Printer("printer3"));
        Thread printer4 = new Thread(new Printer("printer4"));
        Thread printer5 = new Thread(new Printer("printer5"));

        printer1.start();
        printer2.start();
        printer3.start();
        printer4.start();
        printer5.start();
    }


}
