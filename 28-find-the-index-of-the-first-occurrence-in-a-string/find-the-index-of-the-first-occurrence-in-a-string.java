class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.isEmpty()) {
            return 0;
        }
        
        // Loop through haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Take substring of length needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Found at index i
            }
        }
        
        return -1; // Not found
    }
}
