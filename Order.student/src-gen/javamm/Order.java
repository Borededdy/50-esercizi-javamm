package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    boolean _xjconditionalexpression = false;
    boolean _not = (!noA);
    if (_not) {
      _xjconditionalexpression = ((a < b) && (b < c));
    } else {
      _xjconditionalexpression = (b < c);
    }
    return _xjconditionalexpression;
  }

  public static void main(String[] args) {
  }
}
