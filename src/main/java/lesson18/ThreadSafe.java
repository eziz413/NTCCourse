package lesson18;

public class ThreadSafe {

    private int count = 0;

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.startThread();

    }

    public synchronized void artir() {
        count++;

    }

    public void startThread() {
//        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    artir();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    artir();
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("Start Date " + System.currentTimeMillis());
//        long finish = System.currentTimeMillis();

        System.out.println("Count deyisheninin deyeri " + count);
//
//        System.out.println(finish - start);
    }


//    public void threadlerIslet() {
//
//        long start = System.currentTimeMillis();
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100000; i++) {
//                    count++;
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100000; i++) {
//                    artir();
//                }
//            }
//        });
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Start Date " + System.currentTimeMillis());
//        long finish = System.currentTimeMillis();
//
//        System.out.println("Count deyisheninin deyeri " + count);
//
//        System.out.println(finish - start);
//
//    }
}
