import java.util.*;

public class LCM {
  public static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }

  public static long lcm_fast(int a, int b) {
    return ((long)a * (long)b) / (long)gcd_euclid(a, b);
  }

  private static int gcd_euclid(int a, int b) {
    if (a == 1 || b == 1)
      return 1;

    if (b == 0)
      return a;

    int remainder = a - (a / b) * b;
    return gcd_euclid(b, remainder);
  }


  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_fast(a, b));
  }
}
