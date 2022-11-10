package lesson9.homework.vazifa_9_10;

public class Main {

    public static void main(String[] args) {

        String str = "How can you find vowel letters?";
        char[] charArray = str.toCharArray();

        CountVowels vowels = arr -> {

            int count = 0;
            for (char c : arr) {
                if (c == 'a') {
                    count++;
                } else if (c == 'e') {
                    count++;
                } else if (c == 'i') {
                    count++;
                } else if (c == 'o') {
                    count++;
                } else if (c == 'u') {
                    count++;
                }
            }
            return count;
        };

        System.out.println("Matndagi unli harflar soni: " + vowels.countVowels(charArray));
    }
}
