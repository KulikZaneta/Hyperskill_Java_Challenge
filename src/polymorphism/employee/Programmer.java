package polymorphism.employee;

public class Programmer {

    protected final int numProgrammer;

    public Programmer(int numProgrammer) {
        this.numProgrammer = numProgrammer;
        employ();
    }

    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}


