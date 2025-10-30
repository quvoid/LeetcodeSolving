class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charlen = new int[26];
        for(int i = 0;i<s.length();i++){
            charlen[s.charAt(i) - 'a']++;
            charlen[t.charAt(i) - 'a']--;
        }

        for(int count : charlen){
            if(count != 0){
                return false;
            }
        }  
        return true ;
    }
}