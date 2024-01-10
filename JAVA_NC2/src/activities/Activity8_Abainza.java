package activities;

public class Activity8_Abainza {
	public static void main(String[] args) {
		String word = "Alexandra";
		System.out.printf("1. Reverse is : %s\n", reverseString(word));
		System.out.println("=================");
		System.out.printf("2. Occurences of %c in %s: %d\n", 'a', word, countOccurences(word, 'a'));
		System.out.println("=================");
		System.out.println("3. To lowercase: " + convertToLower(word));
		System.out.println("3. To uppercase: " + convertToUpper(word));
		String phrase = "Hi! My name is, Alex";
		System.out.println("=================");		
		System.out.println("4. Splitting substrings:");
		String[] res = splitString(phrase, " ");
		for(String item : res) {
			System.out.println(item);
		}
		System.out.println("=================");
		String word2 = "Supercalifragilisticexpialidocious";

		System.out.println("5. Check startsWith and endsWith for " + word2);

		String prefix = "Supp";
		String suffix = "ous";
		
		System.out.printf("\nStarts with %s? %s", prefix, startsWithSubstring(word2, prefix));
		System.out.printf("\nEnds with %s? %s", suffix, endsWithSubstring(word2, suffix));
		

		
		
	}
	
	private static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
	}
	
	private static int countOccurences(String word, char character) {
		int count = 0, i;
		for(i=0; i<word.length(); i++) {
			if(word.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}
	
	private static String convertToUpper(String word) {
		return word.toUpperCase();
	}
	
	private static String convertToLower(String word) {
		return word.toLowerCase();
	}
	
	private static String[] splitString(String phrase, String delimiter) {
		return phrase.split(delimiter, 0);
	}
	
	private static boolean startsWithSubstring(String word, String prefix) {
		return word.startsWith(prefix);
	    }

	private static boolean endsWithSubstring(String word, String suffix) {
		return word.endsWith(suffix);
    }
	
}
