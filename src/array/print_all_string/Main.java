package array.print_all_string;

public class Main {
    public static void main(String[] args) {
        String[] arguments = {"arg1", "arg2", "arg3"};
        run(arguments);
    }

    static void run(String[] args) {
        for(String str : args)
            System.out.println(str);
    }
}

