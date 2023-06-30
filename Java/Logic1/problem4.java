// Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

public boolean lessBy10(int a, int b, int c) {
  int diffAB = Math.abs(a - b);
        int diffBC = Math.abs(b - c);
        int diffAC = Math.abs(a - c);
        
        return diffAB >= 10 || diffBC >= 10 || diffAC >= 10;
  
}