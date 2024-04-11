package iterating_over_arrays.sum_all_char;

public class Main {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};
        int counter = sumAllChars(characters);
        System.out.println(counter);
    }

    public static int sumAllChars(char[] characters) {
        int counter = 0;
        for (char ch : characters) {
            if (Character.isLetter(ch)) {
                counter++;
            }
        }
        return counter;
    }
}

