package beecrowd;

import java.util.Scanner;

public class Ex1065 {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int somaNumero = 0;
    double[] numero = new double[5];
    numero[0] = sc.nextDouble();
    numero[1] = sc.nextDouble();
    numero[2] = sc.nextDouble();
    numero[3] = sc.nextDouble();
    numero[4] = sc.nextDouble();

    for (int i=0; i < 5; i++) {
      if ((numero[i] % 2) == 0) {
        somaNumero++;
      }
    }
    System.out.println(somaNumero + " valores pares");

    sc.close();

  }
}
