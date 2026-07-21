class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        int maxCnt=0;
        for(int num:nums){
            seen.add(num);
        }

        for(int num:seen){
            if(!seen.contains(num-1)){
                int length=1;
                while(seen.contains(num+length)){
                    length++;
                }
                maxCnt=Math.max(length,maxCnt);
            }

        }
        return maxCnt;
    }
}
