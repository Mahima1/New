public class RabinKarp {

    private static void calHash(String text, String pattern) {
        int pHash = 0;
        int tHash = 0;
        int patLen = pattern.length();
        int textLen = text.length();
        int q = 13;
        int d = 256;
        int h = 1;
        //what we r using in place of 10
//        int h = (int) ((Math.pow(d, patLen - 1)) % q);
        for (int i = 0; i < patLen - 1; i++) {
            h = (h * d) % q;
        }

        patLen = pattern.length();
        for (int i = 0; i < patLen; i++) {
            pHash = ((pHash * d) + (pattern.charAt(i))) % q;
            tHash = ((tHash * d) + (text.charAt(i))) % q;
        }

        for (int i = 0; i <= textLen - patLen; i++) {
            int j;

            if (pHash == tHash) {

                //check every char

                for (j = 0; j < patLen; j++) {

                    if (pattern.charAt(j) != text.charAt(i + j)) {
//                        tHash = ((d * (tHash - (i * h))) + (i + patLen)) % q;
                        break;
                    }
                }

                if (j == patLen) {
                    System.out.println("pattern found at : " + i);
                }
            }


            if (i < textLen - patLen) {
//                tHash = ((d * (tHash - (i * h))) + (i + patLen)) % q;
                tHash = (d * (tHash - text.charAt(i) * h) + text.charAt(i + patLen)) % q;

                if (tHash < 0) {
                    tHash += q;
                }

            }

        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        if (text.length() < pattern.length()) {
            System.out.println(-1);
        }
        if (text.length() == pattern.length()) {
            int ans = text.equals(pattern) ? 0 : -1;
            System.out.println(ans);
        }

        calHash(text, pattern);
    }

}
