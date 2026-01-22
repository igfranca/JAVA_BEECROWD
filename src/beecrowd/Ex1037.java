package beecrowd;

import java.util.Scanner;

public class Ex1037 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float intervalos = sc.nextFloat();
    float[] num = {0.25f, 25.50f, 50.75f, 75.100f};

    if (intervalos >= 0 && intervalos <= 25.0000)  {
      System.out.printf("Intervalo [%.2f]", num[0]);

    } else if (intervalos >= 25.00001 && intervalos <= 50.0000000) {
      System.out.printf("Intervalo (%.2f]", num[1]);

    } else if (intervalos >= 50.0000001 && intervalos <= 10000000.00) {
      System.out.printf("Intervalo (%.3f]", num[3]);

    } else System.out.println("Fora de intervalo");

    sc.close();

  }
}
