package javamm;

@SuppressWarnings("all")
public class HarmonicSum {
  public static int harmonicSum(int x) {
    int n = 0;
    double sum = 0.0;
    double H = 0.0;
    while ((sum < x)) {
      {
        n++;
        H = (H + (1.0 / n));
        double _sum = sum;
        sum = (_sum + H);
      }
    }
    return n;
  }

  public static void main(String[] args) {
  }
}
