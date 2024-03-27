package lesson17;

public class Main {
    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<5;i++){
                    System.out.println("wrirte "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
//        Thread printer1 = new Thread(new Printer3("printer1"));
//        Thread printer2 = new Thread(new Printer3("printer2"));
//
//        printer1.start();
//        printer2.start();

//        Thread printer1 = new Thread(new Printer("printer1"));
//        Thread printer2 = new Thread(new Printer("printer2"));
//
//        printer1.start();
//        printer2.start();

//        Printer2 printer2 = new Printer2("printer2");
//        Printer2 printer21 = new Printer2("printer21");
//
//        printer2.start();
//        printer21.start();
//
//    }
//        Thread printer1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread isleyir");
//                for (int i =0;i<5;i++){
//                    System.out.println("Yazilir "+i);
//                    try {
//                        Thread.sleep(0);
//                    } catch (InterruptedException e) {
//                        System.out.println("test");
//                    }
//                }
//            }
//        });
//        printer1.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread isleyir");
//                for (int i =0;i<5;i++){
//                    System.out.println("Yazilir "+i);
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        System.out.println("test");
//                    }
//                }
//            }
//        }).start();
//
//
    }
}
