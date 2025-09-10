// Last updated: 9/10/2025, 3:15:27 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        
        // char[] sChar = s.toCharArray();
        // char[] tChar = t.toCharArray();

        // Arrays.sort(sChar);
        // Arrays.sort(tChar);

        // return Arrays.equals(sChar, tChar);

        int[] charCount = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i ++){
            char ch = s.charAt(i);
            charCount[ch - 'a']++;

            ch = t.charAt(i);
            charCount[ch - 'a']--;
        }

        for(int count : charCount){
            if(count > 0){
                return false;
            }
        }
        return true;
    }
}