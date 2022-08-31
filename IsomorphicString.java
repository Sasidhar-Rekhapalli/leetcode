class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> firstMap = new HashMap<>();
        HashMap<Character,Character> secondMap = new HashMap<>();

        for(int i=0;i<s.length();i++){

            if((firstMap.containsKey(s.charAt(i))&& firstMap.get(s.charAt(i)) != t.charAt(i)) || (secondMap.containsKey(t.charAt(i)) && secondMap.get(t.charAt(i)) != s.charAt(i))){
                return false;
            }
            firstMap.put(s.charAt(i),t.charAt(i));
            secondMap.put(t.charAt(i),s.charAt(i));
        }
        return true;  
    }
}
