package lesson17;

public class Printer2 extends Thread {
    private String name;

    public Printer2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =0;i<5;i++){
            System.out.println(name+" Yazilir "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("is bitdi");    }
}
