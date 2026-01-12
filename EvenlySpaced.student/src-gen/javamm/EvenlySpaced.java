package javamm;

@SuppressWarnings("all")
public class EvenlySpaced {
  public static boolean evenlySpaced(int a, int b, int c) {
    int _max = EvenlySpaced.max(a, b, c);
    int _mid = EvenlySpaced.mid(a, b, c);
    int _minus = (_max - _mid);
    int _mid_1 = EvenlySpaced.mid(a, b, c);
    int _min = EvenlySpaced.min(a, b, c);
    int _minus_1 = (_mid_1 - _min);
    return (_minus == _minus_1);
  }

  public static int min(int a, int b, int c) {
    if (((a <= b) && (a <= c))) {
      return a;
    }
    if (((b <= a) && (b <= c))) {
      return b;
    }
    return c;
  }

  public static int mid(int a, int b, int c) {
    if ((((a <= b) && (b <= c)) || ((c <= b) && (b <= a)))) {
      return b;
    }
    if ((((b <= a) && (a <= c)) || ((c <= a) && (a <= b)))) {
      return a;
    }
    return c;
  }

  public static int max(int a, int b, int c) {
    if (((a >= b) && (a >= c))) {
      return a;
    }
    if (((b >= a) && (b >= c))) {
      return b;
    }
    return c;
  }

  public static void main(String[] args) {
  }
}
