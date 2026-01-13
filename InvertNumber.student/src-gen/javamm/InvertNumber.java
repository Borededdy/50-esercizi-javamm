package javamm;

@SuppressWarnings("all")
public class InvertNumber {
  public static int invertNumber(int n) {
    int invertedNumber = 0;
    while ((n > 0)) {
      {
        int _invertedNumber = invertedNumber;
        invertedNumber = (_invertedNumber * 10);
        int _invertedNumber_1 = invertedNumber;
        invertedNumber = (_invertedNumber_1 + (n % 10));
        int _n = n;
        n = (_n / 10);
      }
    }
    return invertedNumber;
  }

  public static void main(String[] args) {
  }
}
