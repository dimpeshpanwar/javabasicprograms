class longestPalindromeString {
    public String longestPalindrome(String s) {
        // Check if the input string is empty, return an empty string if so
        if (s.isEmpty())
            return "";

        // Initialize variables to store the indices of the longest palindrome found
        int[] longestPalindromeIndices = { 0, 0 };

        // Loop through the characters in the input string
        for (int i = 0; i < s.length(); ++i) {
            // Find the indices of the longest palindrome centered at character i
            int[] currentIndices = expandAroundCenter(s, i, i);

            // Compare the length of the current palindrome with the longest found so far
            if (currentIndices[1] - currentIndices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                // Update the longest palindrome indices if the current one is longer
                longestPalindromeIndices = currentIndices;
            }

            // Check if there is a possibility of an even-length palindrome centered at
            // character i and i+1
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                // Find the indices of the longest even-length palindrome centered at characters
                // i and i+1
                int[] evenIndices = expandAroundCenter(s, i, i + 1);

                // Compare the length of the even-length palindrome with the longest found so
                // far
                if (evenIndices[1] - evenIndices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                    // Update the longest palindrome indices if the even-length one is longer
                    longestPalindromeIndices = evenIndices;
                }
            }
        }

        // Extract and return the longest palindrome substring using the indices
        return s.substring(longestPalindromeIndices[0], longestPalindromeIndices[1] + 1);
    }

    // Helper function to find and return the indices of the longest palindrome
    // extended from s[i..j] (inclusive) by expanding around the center
    private int[] expandAroundCenter(final String s, int i, int j) {
        // Expand the palindrome by moving outward from the center while the characters
        // match
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--; // Move the left index to the left
            j++; // Move the right index to the right
        }
        // Return the indices of the longest palindrome found
        return new int[] { i + 1, j - 1 };
    }
}