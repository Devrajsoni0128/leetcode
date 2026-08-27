class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int s = 0, e = n-1;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            if(nums[i] != 0)
                ans[s++] = nums[i];
            else
                ans[e--] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
    }
}