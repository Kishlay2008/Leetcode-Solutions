class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] brr = new int[2*n];
        int j = 0;
        for(int i = 0; i < n; i++){
            brr[j++] = nums[i];
        }
        for(int i = 0; i < n; i++){
            brr[j++] = nums[i];
        }
        return brr;
    }
}