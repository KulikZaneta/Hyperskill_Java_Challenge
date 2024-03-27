package interfaces.person;

public class Student implements Person {
    private String name;
    private String subject;

    @Override
    public void getName() {
        System.out.println("Student: " + name + " Subject: " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

