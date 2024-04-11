package iterating_over_arrays.only_one_repeated_letter;

public class Main {
    public static void main(String[] args) {
        char[] example1 = {'a', 'n', 'a'};
        char[] example2 = {'a', 'a', 'a'};
        char[] example3 = {'b', 'c', 'd'};

        System.out.println(isOnlyOneRepeatedLetter(example1));
        System.out.println(isOnlyOneRepeatedLetter(example2));
        System.out.println(isOnlyOneRepeatedLetter(example3));

    }

    public static boolean isOnlyOneRepeatedLetter(char[] array) {
        boolean isFound = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isFound = false;
                    break;
                }
            }
        }
        return isFound;
    }
}

