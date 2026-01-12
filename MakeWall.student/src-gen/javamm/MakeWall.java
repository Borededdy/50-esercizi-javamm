package javamm;

@SuppressWarnings("all")
public class MakeWall {
  public static boolean isWallDoable(int s, int b, int g) {
    int btoUse = Math.min(b, (g / 5));
    int remainder = (g - (btoUse * 5));
    return (s >= remainder);
  }

  public static void main(String[] args) {
    System.out.println(MakeWall.isWallDoable(3, 1, 8));
    System.out.println(MakeWall.isWallDoable(3, 1, 9));
    System.out.println(MakeWall.isWallDoable(3, 2, 10));
    System.out.println(MakeWall.isWallDoable(3, 3, 14));
    System.out.println(MakeWall.isWallDoable(2, 10, 48));
  }
}
