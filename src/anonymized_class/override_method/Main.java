package anonymized_class.override_method;

public class Main {

    public static void main(String[] args) {

        SingleMethodInterface instance = new SingleMethodInterface() {
            @Override
            public void doSomething() {
                System.out.println("The anonymous class does something");
            }
        };

        instance.doSomething();
    }
    /*
    SingleMethodInterface instance = () -> System.out.println("The anonymous class does something");

        instance.doSomething();
     */
}

