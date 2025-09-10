// Last updated: 9/10/2025, 4:06:46 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> results = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedString = new String(charArray);
            results.putIfAbsent(sortedString, new ArrayList<>());
            results.get(sortedString).add(str);
        }

        return new ArrayList<>(results.values());
        
    }
}