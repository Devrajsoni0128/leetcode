class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        int prev = nums[0];

        for (int i = 1; i < n - 1; i++) {

            if (nums[i] == prev) {
                continue;
            }

            int right = i + 1;
            while (right < n && nums[right] == nums[i]) {
                right++;
            }

            if (right < n) {
                if ((nums[i] > prev && nums[i] > nums[right]) ||
                    (nums[i] < prev && nums[i] < nums[right])) {
                    count++;
                }
            }

            prev = nums[i];
        }

        return count;
    }
}
