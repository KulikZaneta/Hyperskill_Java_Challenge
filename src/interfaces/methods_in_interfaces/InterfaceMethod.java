package interfaces.methods_in_interfaces;

public interface InterfaceMethod {
    int INT_CONSTANT = 0;

    void instanceMethod1();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    static void staticMethodWithoutBody() {}

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }

    default void defaultMethodWithoutBody() {}

    private void privateMethod() {
        System.out.println("Interface: private methods in interfaces are acceptable but should have a body");
    }
}
