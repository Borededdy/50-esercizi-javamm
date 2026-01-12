package javamm;

@SuppressWarnings("all")
public class RoundSum {
  public static int roundSum(int a, int b, int c) {
    int _round = RoundSum.round(a);
    int _round_1 = RoundSum.round(b);
    int _plus = (_round + _round_1);
    int _round_2 = RoundSum.round(c);
    return (_plus + _round_2);
  }

  public static int round(int n) {
    int ultimaCifra = (n % 10);
    if ((ultimaCifra < 5)) {
      return (n - ultimaCifra);
    } else {
      return (n + (10 - ultimaCifra));
    }
  }

  public static void main(String[] args) {
  }
}
