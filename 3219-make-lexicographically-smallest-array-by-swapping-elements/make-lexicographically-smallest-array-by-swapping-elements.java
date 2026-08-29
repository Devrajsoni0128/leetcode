class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] res = new int[n];
        int i = 0;
        
        while (i < n) {
            int j = i + 1;
            while (j < n && pairs[j][0] - pairs[j - 1][0] <= limit) {
                j++;
            }

            int segmentLength = j - i;
            int[] originalIndices = new int[segmentLength];
            for (int k = 0; k < segmentLength; k++) {
                originalIndices[k] = pairs[i + k][1];
            }
            
            Arrays.sort(originalIndices);
            
            for (int k = 0; k < segmentLength; k++) {
                res[originalIndices[k]] = pairs[i + k][0];
            }
            
            i = j;
        }
        
        return res;
    }
}