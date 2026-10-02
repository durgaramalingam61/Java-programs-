public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.breed = "Shizuu";
        System.out.println(dog.breed);
    }
}

class AnimalUser {
    String name;
    String breed;
    int age;

    void run() {
        System.out.println("running fast");
    }
}

class Dog extends AnimalUser {
    void makeSound() {
        System.out.println("woof woof");
    }
}

class Cat extends AnimalUser {
    void makeSound() {
        System.out.println("Meow");
    }
}

