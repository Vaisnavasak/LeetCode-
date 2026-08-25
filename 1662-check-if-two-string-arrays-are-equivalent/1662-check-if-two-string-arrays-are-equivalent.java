class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String a = "";
        String b = "";
        for(String i:word1)
        {
            a=a.concat(i);
        }
        for(String j:word2)
        {
            b=b.concat(j);
        }
        return a.equals(b);
    }
}