class Solution {
    public int distributeCandies(int[] candyType) {
        int length = candyType.length;
        HashSet<Integer> set = new HashSet<>();

        for(int candy : candyType){
            set.add(candy);
        }
        int sandy = length / 2;
        return Math.min(set.size(),sandy);
    }
}