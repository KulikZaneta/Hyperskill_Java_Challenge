package anonymized_class.anonymized_class;

public class Main {
    public static void main(String[] args) {
        final int x = 10;

        SomeInterface si = new SomeInterface() {
            public int method() {  // always to be overridden upon implementation
                return x;
            }

            public int anotherMethod() {
                return 20;
            }
        };

        System.out.println(si.method());
        System.out.println(si.anotherMethod());
    }
}

