package javamm;

@SuppressWarnings("all")
public class BinaryToDecimal {
  public static long decimal(int[] a) {
    long converted = 0;
    int pow = 0;
    for (int i = (a.length - 1); (i >= 0); i--) {
      {
        long _converted = converted;
        double _pow = Math.pow(2, pow);
        double _multiply = (_pow * a[i]);
        converted = (_converted + ((int) _multiply));
        pow++;
      }
    }
    return converted;
  }

  public static void main(String[] args) {
  }
}
