class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j <= nums.length -1; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            if(numbers.contains(num)){
                return true;
            }
            numbers.add(num);
        }
        return false;
 
    }
}