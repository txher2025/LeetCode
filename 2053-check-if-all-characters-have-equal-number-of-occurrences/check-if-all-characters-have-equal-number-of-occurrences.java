class Solution {
    public boolean areOccurrencesEqual(String s) {
       int[] freq = new int[26];

        // Count character frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find the first non-zero frequency
        int targetFreq = 0;
        for (int f : freq) {
            if (f > 0) {
                if (targetFreq == 0) targetFreq = f;
                if (targetFreq != f) return false;
            }
        }
        return true;
    }
 
    }
