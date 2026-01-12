package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    if (((a == b) && (a != c))) {
      return c;
    }
    if (((a == c) && (a != b))) {
      return b;
    }
    if (((c == b) && (c != a))) {
      return a;
    }
    if (((a != b) && (a != c))) {
      return (a + (b + c));
    }
    return 0;
  }

  public static void main(String[] args) {
  }
}
