// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

public int loneSum(int a, int b, int c) {
  if (a != b && a != c && b != c) {
    return a + b + c;
  } else if (a == c && a == b && b == c) {
    return 0;
  } else if (a == c && a != b) {
    return b;
  } else if (a == b && a != c) {
    return c;
  }else if (b == c && b !=a) {
    return a;
  }
  return 0;
}
