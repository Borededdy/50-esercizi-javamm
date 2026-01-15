package javamm;

@SuppressWarnings("all")
public class Armstrong {
  public static boolean armstrong(int n) {
    int numerocifre = 0;
    int tmp = n;
    int sum = 0;
    while ((tmp > 0)) {
      {
        numerocifre++;
        int _tmp = tmp;
        tmp = (_tmp / 10);
      }
    }
    tmp = n;
    while ((tmp > 0)) {
      {
        int _sum = sum;
        double _pow = Math.pow((tmp % 10), numerocifre);
        sum = (_sum + ((int) _pow));
        int _tmp = tmp;
        tmp = (_tmp / 10);
      }
    }
    if ((sum == n)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
  }
}
