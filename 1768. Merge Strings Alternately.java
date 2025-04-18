class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder str =new StringBuilder();
        while(i<word1.length() && i<word2.length()){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }
        if(i<word1.length()){
            str.append(word1.substring(i,word1.length()));
        }
        else{
            str.append(word2.substring(i,word2.length()));
        }
        return str.toString();
    }
}
