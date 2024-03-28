package anonymized_class.runnable;

public class Main {
    public static Runnable createRunnable(String text, int repeats) {
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < repeats; i++) {
                    System.out.println(text);
                }
            }
        };
    }
}
//        return () -> System.out.println((text + "\n").repeat(repeats));

