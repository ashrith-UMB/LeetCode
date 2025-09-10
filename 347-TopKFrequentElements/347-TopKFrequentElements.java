// Last updated: 9/10/2025, 4:51:56 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[]{};
        }

        Map<Integer, Integer> countingFrequency = new HashMap<>();

        for(int num : nums){
            if(countingFrequency.containsKey(num)){
                int count = countingFrequency.get(num);
                countingFrequency.replace(num, count, count + 1);
            }else{
                countingFrequency.put(num, 1);
            }
        }

        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer, Integer> map : countingFrequency.entrySet()){
            arr.add(new int[]{map.getValue(), map.getKey()});

        }

        arr.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr.get(i)[1];
        }
        return result;
    }
}