class Solution {
    
    private int minLen(String[] strs){
         int n = strs.length;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            int len = strs[i].length();
            min=len < min ? len : min ;
        }
        return min;
    }
    
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int n = strs.length;
        if (n==0 ) return prefix;
        for (int i=0; i<minLen(strs); i++){
            char currChar = strs[0].charAt(i);
            for (int j=0; j<n; j++){
                if(currChar != strs[j].charAt(i)){
                    return prefix;
                }
                
            }
            prefix+=(currChar);
                
        }
        return prefix;
    }
}
