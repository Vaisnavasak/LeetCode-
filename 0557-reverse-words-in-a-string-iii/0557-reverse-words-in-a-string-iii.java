class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        String str = "";
        for(String word:arr)
        {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            str+=(String.valueOf(sb))+" ";
        }
        return str.trim();
    }
}