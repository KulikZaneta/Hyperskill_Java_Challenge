package polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Animal();
        myAnimal.makeSound();

        myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}

