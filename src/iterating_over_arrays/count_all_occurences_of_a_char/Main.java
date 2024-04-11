package iterating_over_arrays.count_all_occurences_of_a_char;

public class Main {
    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'c', 'a', 'b', 'c', 'a'};
        int[] occurrences = new int[26];

        sumAllOccurrenceChar(characters, occurrences);
    }


    public static void sumAllOccurrenceChar(char[] characters, int[] occurrences) {
        for (char ch : characters) {
            /*ch >= 'a' && ch <= 'z'*/
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                occurrences[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++)
            if (occurrences[i] > 0) {
                System.out.printf("'%c': %d" + "\n", 'a' + i, occurrences[i]);
            }
    }
}

