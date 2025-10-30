class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> worded = new HashMap<>();

        for(String s : strs){
            char[] chars =  s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!worded.containsKey(sorted)){
                worded.put(sorted, new ArrayList<>());
            }

            worded.get(sorted).add(s);

        }
        return new ArrayList<>(worded.values());        
    }
}