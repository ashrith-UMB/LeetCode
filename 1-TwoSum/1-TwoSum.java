// Last updated: 4/14/2025, 9:12:11 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arLength = nums.length;
        int solFound = 0;
        int solution[] = new int[2];
        Map<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i<arLength; i++){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[]{complementIndex, i};
            }
            complements.put(target - nums[i], i);
            // for(int j = i+1; j<arLength; j++){
            //     if(nums[i]+nums[j] == target){
            //         //System.out.println("["+i+","+j+"]");
            //         solution[0] = i;
            //         solution[1] = j;
            //         solFound = 1;
            //         break;

            //     }
            //     if(solFound == 1){
            //         break;
            //     }
            // }

        }
        return nums;
    }
}