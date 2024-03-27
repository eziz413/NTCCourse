package lesson18;

public class Printer implements Runnable{

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name +"isleyir");

        for (int i =0;i<5;i++){
            System.out.println(name+"Yazilir"+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("is bitdi");
    }
}
