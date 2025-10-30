class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> worded = new HashMap<>();

        
        for(String s : strs){
            char[] chars =  s.toCharArray();    //convert the string to character
            Arrays.sort(chars);                            //sort the character
            String sorted = new String(chars);  

            if(!worded.containsKey(sorted)){        //first aet comes , it is checked if aet is in the hashmap , if not it is added aet as key then eat which is the sort of aet is added , then tea enters , which is sorted to aet , aet is checked , it is already present so tea is directly added at line 16 through add(s)
                worded.put(sorted, new ArrayList<>());
            }

            worded.get(sorted).add(s);

        }
        return new ArrayList<>(worded.values());        
    }
}