package iterating_over_arrays.count_occurrences_of_a_char;

public class Main {
    public static void main(String[] args) {

        char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};
        sumOccurrenceChar(characters);
    }

    public static void sumOccurrenceChar(char[] characters) {
        int counter = 0;

        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

