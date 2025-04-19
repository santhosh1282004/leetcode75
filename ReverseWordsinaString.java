class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String [] str =s.split(" ");
        int i=str.length-1;
        while(i>=0){
            if(str[i]!=""){
                sb.append(str[i]);
                sb.append(" ");
            }
            i--;
        }
        sb.deleteCharAt(sb.length()-1); 
        return sb.toString();
    }
}
