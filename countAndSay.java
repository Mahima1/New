class countAndSay {
    public static String cnt(int n) {
        String a = "1";
        String newa = "";
        int count = 0;
        if (n == 0) {
            return "";
        }
        if(n==1){
            return a;
        }
        for (int j = 2; j <= n; j++) {
            char current = a.charAt(0);
            newa="";
            for (int i = 0; i < a.length(); i++) {
                if (current != a.charAt(i)) {
                    newa = newa + (count) + (a.charAt(i - 1));
                    System.out.println(newa);
                    System.out.println("  count is "+count);
                    count = 0;
                    current = a.charAt(i);
                } else {
                    count++;
                }
            }
            char c = a.charAt(a.length()-1);
            System.out.println(" c is "+c);
            newa = newa + (count) + (c);
            a=newa;
        }
        return a;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(cnt(n));

    }
}
