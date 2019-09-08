class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        boolean[] visited = new boolean[wordList.size()];
        q.add(beginWord+" 1");
        
        String currWord=beginWord + " 1";
        while(!q.isEmpty()){
           String[] arr = q.remove().split(" ");
            currWord = arr[0];
            int layer = Integer.parseInt(arr[1]);
            if(currWord.equals(endWord)){
                return layer;
            }
            for(int i=0; i < wordList.size(); i++){
                if(!visited[i] && diff(currWord, wordList.get(i))){
                    q.add(wordList.get(i) + " " + (layer+1));
                    visited[i]=true;
                }            
            }
        }
        return 0;
    }
    private boolean diff(String a , String b){
        int total=0;
        if(a.length() != b.length()){
            return false;
        } else {
            for (int i=0; i < a.length(); i++){
                if(a.charAt(i)!=b.charAt(i)){
                    total++;
                }
        }
    }
        return total==1;
}
}
    
    
