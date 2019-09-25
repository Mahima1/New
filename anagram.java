class anagram {
    static boolean isAnagram(String s, String t) {
        long stemp = 0;

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            stemp += s.charAt(i) ^ t.charAt(i);
        }
        if (stemp == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "anagram"));
    }
}