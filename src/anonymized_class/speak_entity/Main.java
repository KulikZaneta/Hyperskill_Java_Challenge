package anonymized_class.speak_entity;

public class Main {
    public void someMethod() {
        SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {

            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };
        englishSpeakingPerson.sayHello();
        englishSpeakingPerson.sayBye();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.someMethod();

    }
}

