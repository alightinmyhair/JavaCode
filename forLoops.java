//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
//Each unique element appears only once. The relative order of the elements should be kept the same.



class Solution {
    public int[] sortedSquares(int[] nums) {

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


//Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution{
    public int findMaxConsecutiveOnes(int[] nums){

        int count = 0;
        int maxCount = 0;

        for(int i =0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        return Math.max(maxCount, count);
    }

}


//Declaring an integer array of 10 elements
int[] int_array = new int[10];

//the array currently contains 0 elements
int length = 0;

//Add elements at the first 6 indexes of the Array
for(int i=0; i <6; i++){
    int_array[length] = i;
    length++;
}

//this for loop will print out every valid index in the array
for(int i=0; i < int_array.length; i++){
    System.out.println(int_array[i]);
}

//this for loop will just print out how big the array is
for(int i =0; i < length; i++){
    System.out.println(int_array[i]);
}

/*--The problem below shows us how to move all elements
in an array to the left by one index, when an element is removed
--*/
for(int i=0; i< length; i++){
    //shifting each element one position to the left
    int_array[i-1] = int_array[i];
}
// Note that it's important to reduce the length of the array by 1.
// Otherwise, we'll lose consistency of the size. This length
// variable is the only thing controlling where new elements might
// get added.
length--;



/*--Given an integer array nums and an integer val
remove all occurrences of val in nums in-place
The relative order of the elements may be changed.
--*/

//1st Solution, basic and can be used

class Solution {
    public int removeElement(int[] nums, int val){

        int i = 0;

        for(int j=0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                j++;
            }
        }
        return i;
    }
}

//2nd solution, better as it accounts for whether val is at the end
//or beginning of the array. So essentially there could be 
//unnecessary copy operation if we move forward with the 1st solution


class Solution {
    public int removeElement(int[] nums, int val){

        int i = 0;
        int n = nums.length;

        while(i < n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        return n;

    }
}


//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
//such that each unique element appears only once. The relative order of the elements should be kept the same.

