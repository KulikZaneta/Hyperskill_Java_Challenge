package _static.too_many_cats;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(" ", 5);
        Cat cat1 = new Cat(" ", 5);
        Cat cat2 = new Cat(" ", 5);
        Cat cat3 = new Cat(" ", 5);
        Cat cat4 = new Cat(" ", 5);
        Cat cat5 = new Cat(" ", 5);
        System.out.println(Cat.getNumberOfCats());
    }
}

