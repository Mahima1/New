class anagram {
    static boolean isAnagram(String s, String t) {
        long stemp = 0, ttemp = 0;
        for (int i = 0; i < s.length(); i++) {
            stemp += s.charAt(i);
            ttemp += t.charAt(i);
        }
        if (stemp == ttemp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naamgra"));
    }
}