package javamm;

@SuppressWarnings("all")
public class NoTeenSum {
  public static int noTeenSum(int a, int b, int c) {
    int _fixTeen = NoTeenSum.fixTeen(a);
    int _fixTeen_1 = NoTeenSum.fixTeen(b);
    int _plus = (_fixTeen + _fixTeen_1);
    int _fixTeen_2 = NoTeenSum.fixTeen(c);
    return (_plus + _fixTeen_2);
  }

  public static int fixTeen(int n) {
    if ((((n < 13) || (n > 19)) || ((n == 15) || (n == 16)))) {
      return n;
    }
    return 0;
  }

  public static void main(String[] args) {
  }
}
