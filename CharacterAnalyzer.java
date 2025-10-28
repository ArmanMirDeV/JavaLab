public class CharacterAnalyzer {



    public void analyzeCharacters(char[] chars) {
        int vowels = 0, consonants = 0, digits = 0, specialChar = 0;



        for (char ch : chars) {
            if (Character.isLetter(ch)) { // If it's a letter
                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) { // If it's a digit
                digits++;
            } else {
                specialChar++;
            }
        }

        // Print results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChar);
    }

    // Helper method to check vowels
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        CharacterAnalyzer analyzer = new CharacterAnalyzer();

        // Example array (you can change it!)
        char[] arr = { 'H', 'e', 'l', 'l', 'o', '1', '2', '#', '!', 'J', 'a', 'v', 'a' };

        // Analyze characters
        analyzer.analyzeCharacters(arr);
    }
}
