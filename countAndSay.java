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
            count=0;
//            System.out.println("a len is : "+a.length());
            for (int i = 0; i < a.length(); i++) {
                if (current != a.charAt(i)) {
                    newa = newa + (count) + (a.charAt(i - 1));
//                    System.out.println("newa is :" + newa);
//                    System.out.println("  count is "+count);
                    count = 1;
                    current = a.charAt(i);
                } else {
                    count++;
                }
            }
            char c = a.charAt(a.length()-1);
//            System.out.println(" c is "+c);
//            System.out.println("count after loop is "+count);
            newa = newa + (count) + (c);
            a=newa;
        }
        return a;
    }
    public static void main(String[] args){

        System.out.println(cnt(1));
        System.out.println(cnt(2));
        System.out.println(cnt(3));
        System.out.println(cnt(4));
        System.out.println(cnt(10));
        System.out.println(cnt(90));
        System.out.println(cnt(15));
        System.out.println(cnt(23));
        System.out.println(cnt(45));

    }
}
