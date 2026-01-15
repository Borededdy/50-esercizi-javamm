package javamm;

@SuppressWarnings("all")
public class OverAverage {
  public static int[] overAverage(int[] a) {
    int sum = 0;
    for (int num : a) {
      int _sum = sum;
      sum = (_sum + num);
    }
    int _length = a.length;
    int _divide = (sum / _length);
    double avg = ((double) _divide);
    int c = 0;
    for (int num_1 : a) {
      if ((num_1 > avg)) {
        c++;
      }
    }
    int[] numbersOverAvg = new int[c];
    int indx = 0;
    for (int num_2 : a) {
      if ((num_2 > avg)) {
        numbersOverAvg[indx] = num_2;
        indx++;
      }
    }
    return numbersOverAvg;
  }

  public static void main(String[] args) {
  }
}
