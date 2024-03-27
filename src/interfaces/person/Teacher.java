package interfaces.person;

public class Teacher implements Person {
    private String name;
    private String subject;

    @Override
    public void getName() {
        System.out.println("Teacher: " + name + " Subject: " + subject);
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}


