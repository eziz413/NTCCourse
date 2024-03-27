package lesson15;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String danish() {
        return this.getName()+ "Heyvan danishir";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String danish() {
        return this.getName() + " dog";
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String danish() {
        return this.getName() + " cat";
    }
}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public String danish() {
        return this.getName() + " horse";
    }
}


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Test  1");
        Animal animal1 = new Dog("Test 2");
        Animal animal2 = new Cat("Test 3");
        Animal animal3 = new Horse("Test 4");

        System.out.println(animal.danish());
        System.out.println(animal1.danish());
        System.out.println(animal2.danish());
        System.out.println(animal3.danish());
    }
}
