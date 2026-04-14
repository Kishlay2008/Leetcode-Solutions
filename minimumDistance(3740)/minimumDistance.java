class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int distance;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        distance = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        min = Math.min(min, distance);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        else return min;
            }
}