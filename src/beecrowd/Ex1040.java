package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1040 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n1, n2, n3, n4;
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    n4 = sc.nextDouble();

    double mediaPeso = ((n1 * 2) + (n2 * 3 ) + (n3 * 4) + (n4 * 1)) / 10;

    DecimalFormat df = new DecimalFormat("0.0");
    System.out.println("Media: " + df.format(mediaPeso));

    if (mediaPeso >= 5.0 && mediaPeso <=6.9) {
      System.out.println("Aluno em exame.");

      double notaExame = sc.nextDouble();
      System.out.printf("Nota do exame: %.1f%n", notaExame);

      double mediaFinal = (mediaPeso + notaExame) / 2.0;

      if (mediaFinal >= 5.0) {
        System.out.println("Aluno aprovado.");
      } else {
        System.out.println("Aluno reprovado.");
      }

      System.out.printf("Media final: %.1f%n", mediaFinal);

    } else if (mediaPeso >= 7.0) {
      System.out.println("Aluno aprovado.");
    } else {
      System.out.println("Aluno reprovado.");
    }
  }
}
