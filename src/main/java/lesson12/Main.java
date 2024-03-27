package lesson12;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Qara");
        car.setModel("Doge");
        car.setYear(2017);

        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getYear());
    }
}
