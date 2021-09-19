class Solution {
    public int sortedSquares(int[] nums) {

        //square each element
        //sort elements in non-decreasing order
        //non-decreasing order == increasing order

        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n-1;

        for(int i = n-1; i >= 0; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            }else{
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}
