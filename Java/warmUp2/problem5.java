// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


public boolean arrayFront9(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums.length < 4) {
        if (nums[i] == 9) {
          return true;
        }
    } else if (nums[i] >= 4) {
        if  (nums[0] == 9 || nums[1] == 9 || nums[2] == 9 || nums[3] == 9) {
          return true;
        }
        return false;
    }
  }
  return false;
}
