// Last updated: 7/3/2025, 12:02:19 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {



        /* Wrong approach - goes wrong for string "dvdf"
        Set<Character> stringSet = new HashSet<Character>();
        int count = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            if(stringSet.contains(s.charAt(i))){
                if(count > max)
                    max = count;

                count = 1;
                stringSet.clear();
                stringSet.add(s.charAt(i));
                continue;
            }
            stringSet.add(s.charAt(i));
            count++;
        }
        return Math.max(count, max);*/

        //SLIDING WINDOW APPROACH
        Set<Character> charSet = new HashSet<Character>();
        int max = 0, left = 0;

        for(int right = 0; right < s.length(); right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}