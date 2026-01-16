package javamm;

@SuppressWarnings("all")
public class HIndex {
  public static int hIndex(int[] a) {
    for (int h = a.length; (h > 0); h--) {
      {
        int contatore = 0;
        for (int i = 0; (i < a.length); i++) {
          boolean _greaterEqualsThan = (a[i] >= h);
          if (_greaterEqualsThan) {
            contatore++;
          }
        }
        if ((contatore >= h)) {
          return h;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
  }
}
