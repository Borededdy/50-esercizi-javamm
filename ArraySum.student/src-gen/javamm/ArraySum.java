package javamm;

@SuppressWarnings("all")
public class ArraySum {
  public static int[] arraySum(int[] a, int[] b) {
    int[] sum = new int[a.length];
    for (int i = 0; (i <= (a.length - 1)); i++) {
      int _plus = (a[i] + b[i]);
      sum[i] = _plus;
    }
    return sum;
  }

  public static void main(String[] args) {
  }
}
