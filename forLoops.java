
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


//PROBLEM:Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
//such that each unique element appears only once. The relative order of the elements should be kept the same.


//SOLUTION:The problem below shows a two pointer approach.
//There are two variables: one set to 0 and one set to 1, aka the latter
//being ahead of the 1st index in an array
//Then, looping through the array and using the 2 variables to compare the 
//elements in the array, duplicates can be caught
class Solution {
    public int removeDuplicates(int[] nums){
        if(num.length == 0){
            return 0;
        }

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

//function below (and algorithm)
//to search for items in an array
public static boolean linearSearch(int[] array, int length, int element){


    //check for edge cases: is the array null or empty?
    if(array == null || length == 0) {
        return false;
    }

    //carry out the linear search by checking each element, starting from the first one
    for(int i =0; i< length; i_++) {
        //found the element
        if(array[i] == element) {
            return true;
        }
    }
    //didn't find element
    return false;
}

//PROBLEM:
//Given an array or integers, check if there exists two integers N & M such that N is the double of M (i.e. N=2*M)

class Solution {
    public boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]*2) || (arr[i]%2 == 0 && set.contains(arr[i]/2)))
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}
