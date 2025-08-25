class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // found a new unique element
                i++;
                nums[i] = nums[j]; // move unique element forward
            }
        }

        return i + 1; // number of unique elements
    }
}
