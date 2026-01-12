package javamm;

@SuppressWarnings("all")
public class Range {
  public static boolean range(int n, int l, int r, boolean o) {
    boolean _not = (!o);
    if (_not) {
      return ((n >= l) && (n <= r));
    } else {
      boolean _not_1 = (!((n >= l) && (n <= r)));
      return _not_1;
    }
  }

  public static void main(String[] args) {
  }
}
