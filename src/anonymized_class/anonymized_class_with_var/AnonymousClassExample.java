package anonymized_class.anonymized_class_with_var;

public class AnonymousClassExample {

    private static String BYE_STRING = "Auf Wiedersehen!";

    public static void main(String[] args) {

        final String hello = "Guten Tag!";

        SpeakingEntity germanSpeakingPerson = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println(hello); // it captures the local variable
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING); // it captures the constant field
            }
        };

        germanSpeakingPerson.sayHello();

        germanSpeakingPerson.sayBye();
    }
}

