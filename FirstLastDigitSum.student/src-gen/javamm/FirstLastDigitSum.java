package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    int LastDigit = (n % 10);
    while ((n > 9)) {
      int _n = n;
      n = (_n / 10);
    }
    return (n + LastDigit);
  }

  public static void main(String[] args) {
    System.out.println(FirstLastDigitSum.firstLastDigitSum(1095359));
  }
}
