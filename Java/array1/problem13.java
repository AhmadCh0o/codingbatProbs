// Given an int array length 2, return true if it does not contain a 2 or 3.


public boolean no23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 3) {
    return false;
  } else if (nums[0] == 3 || nums[1] == 2) {
    return false;
  }
    return true;
}
