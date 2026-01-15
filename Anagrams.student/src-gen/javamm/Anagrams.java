package javamm;

@SuppressWarnings("all")
public class Anagrams {
  public static boolean anagrams(int[] s, int[] t) {
    int _length = s.length;
    int _length_1 = t.length;
    boolean _tripleNotEquals = (_length != _length_1);
    if (_tripleNotEquals) {
      return false;
    }
    int[] sSorted = Anagrams.orderArray(s);
    int[] tSorted = Anagrams.orderArray(t);
    for (int i = 0; (i < sSorted.length); i++) {
      boolean _tripleNotEquals_1 = (sSorted[i] != tSorted[i]);
      if (_tripleNotEquals_1) {
        return false;
      }
    }
    return true;
  }

  public static int[] orderArray(int[] arr) {
    for (int i = 0; (i < arr.length); i++) {
      for (int j = (i + 1); (j < arr.length); j++) {
        {
          int tmp = 0;
          boolean _greaterThan = (arr[i] > arr[j]);
          if (_greaterThan) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
          }
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
  }
}
