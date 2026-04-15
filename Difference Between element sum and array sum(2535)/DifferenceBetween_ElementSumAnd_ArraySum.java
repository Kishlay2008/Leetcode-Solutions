class Solution {
    static int sum(int[] arr){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    static int sumDigit(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            while(arr[i] != 0){
             sum += arr[i] % 10;
              arr[i] /= 10;
            }
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int difference = Math.abs(sum(nums) - sumDigit(nums));
        return difference;
    }
}