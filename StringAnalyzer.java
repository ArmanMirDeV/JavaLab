import java.util.Scanner;

public class StringAnalyzer {

    // Method to analyze a string
    public void analyze(String str) {
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        // Display results
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringAnalyzer analyzer = new StringAnalyzer();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        analyzer.analyze(input);

        sc.close();
    }
}
