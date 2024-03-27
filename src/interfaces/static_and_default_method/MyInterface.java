package interfaces.static_and_default_method;

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("Domyślna implementacja metody");
    }

    static void staticMethod() {
        System.out.println("Metoda statyczna");
    }
}
