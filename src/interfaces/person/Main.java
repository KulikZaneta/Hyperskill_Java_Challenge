package interfaces.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] inputs = sc.nextLine().split(":");
            if (inputs[0].startsWith("T")) {
                Teacher teacher = new Teacher(inputs[1], inputs[2]);
                teacher.getName();
            } else if (inputs[0].startsWith("S")) {
                Student student = new Student(inputs[1], inputs[2]);
                student.getName();
            }
        }
        sc.close();
    }
}

