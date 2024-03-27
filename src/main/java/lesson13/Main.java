package lesson13;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Midilli","Horse",14);
        System.out.println(animal.getAge()+" "+animal.getName()+" "+animal.getSort());

        Animal animal1 = new Animal("Midilli",14);
        System.out.println(animal1.getName()+" "+animal1.getAge());

        Animal animal2 = new Animal("Horse");
        System.out.println(animal2.getSort());
    }

}
