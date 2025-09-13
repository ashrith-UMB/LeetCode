// Last updated: 9/13/2025, 6:03:18 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*int multiple = 1;
        for(int num : nums){
            if(num != 0){
                multiple *= num;
            }
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                result[i] = multiple/nums[i];
            }else{
                result[i] = 0;
            }

        }

        return result;*/
        int length = nums.length;
        int[] preff = new int[length];
        int[] suff = new int[length];
        int[] result = new int[length];

        preff[0] = 1;
        suff[length - 1] = 1;

        for(int i = 1; i < length; i++){
            preff[i] = nums[i - 1] * preff[i - 1];
        }
        for(int i = length - 2; i >= 0; i--){
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for(int i = 0; i < length; i ++){
            result[i] = preff[i] * suff[i];
        }

        return result;

    }
}