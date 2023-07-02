// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int countEvens(int[] nums) {
  int even = 0;
  for (int i = 0; i < nums.length; i = i + 1) {
    if (nums[i] % 2 == 0) {
      even++;
    }
  }
  return even;
}
