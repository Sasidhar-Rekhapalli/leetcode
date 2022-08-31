class Solution {
    public boolean isSubsequence(String s, String t) {
       int counter = 0;
        int loop = 0;
        for (int i=0;i<s.length();i++){
            for (int j = loop ;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    counter++;
                    loop = j+1;
                    break;
                }
            }
        }

        return counter == s.length(); 
    }
}
