package interfaces.static_and_default_method;

public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyInterface.staticMethod();

        MyClass obj = new MyClass();
        obj.defaultMethod(); // default impl
    }
}

