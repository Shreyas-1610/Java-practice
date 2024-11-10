import java.util.HashMap;
import java.util.Map;

public class Vowel {
    public static void main(String[] args) {
        String S = "ybghjahebuyitob"; // Input string
        int result = countPermutations(S);
        System.out.println("Count of permutations: " + result);
    }

    public static int countPermutations(String S) {
        // Define vowels
        String vowels = "aeiouAEIOU";
        StringBuilder consonants = new StringBuilder();
        int vowelCount = 0;

        // Count vowels and build consonants string
        for (char c : S.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                vowelCount++;
            } else {
                consonants.append(c);
            }
        }

        // Calculate the permutations of consonants
        return calculatePermutations(consonants.toString());
    }

    private static int calculatePermutations(String consonants) {
        // Count frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : consonants.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int totalChars = consonants.length();
        int permutations = factorial(totalChars);

        // Divide by the factorial of the counts of each character
        for (int count : charCount.values()) {
            permutations /= factorial(count);
        }

        return Math.max(permutations, 0); // Ensure result is non-negative
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
