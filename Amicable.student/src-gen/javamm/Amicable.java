package javamm;

@SuppressWarnings("all")
public class Amicable {
  public static boolean amicable(int a, int b) {
    if (((Amicable.calcolaSommaDivisori(a) == b) && (Amicable.calcolaSommaDivisori(b) == a))) {
      return true;
    }
    return false;
  }

  public static int calcolaSommaDivisori(int n) {
    int sum = 0;
    for (int i = 1; (i <= (n / 2)); i++) {
      if (((n % i) == 0)) {
        int _sum = sum;
        sum = (_sum + i);
      }
    }
    return sum;
  }

  public static void main(String[] args) {
  }
}
