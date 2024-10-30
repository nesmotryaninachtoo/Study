/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */
public static boolean isPalindrome(String text) {
        StringBuilder reversedText = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "")).reverse();
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().equals(reversedText.toString().toLowerCase());
    }
