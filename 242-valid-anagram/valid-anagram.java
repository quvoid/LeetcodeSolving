class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charlen = new int[26];        //creates a 26 boxes for storing the alphabets 
        for(int i = 0;i<s.length();i++){
            charlen[s.charAt(i) - 'a']++;   //plus any character on i by 1 
            charlen[t.charAt(i) - 'a']--;   //minus any character on i by 1
        }

        for(int count : charlen){
            if(count != 0){                 //(-1+1 = 0 ) everything in array should be zero 
                return false;
            }
        }  
        return true ;
    }
}