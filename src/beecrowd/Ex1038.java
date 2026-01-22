package beecrowd;

import java.util.Scanner;

public class Ex1038 {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      int codigo = scanner.nextInt();
      int quantidade = scanner.nextInt();

      switch (codigo) {
        case 1 -> System.out.printf("Total: R$ %.2f%n", 4.0 * quantidade);
        case 2 -> System.out.printf("Total: R$ %.2f%n", 4.5 * quantidade);
        case 3 -> System.out.printf("Total: R$ %.2f%n", 5.0 * quantidade);
        case 4 -> System.out.printf("Total: R$ %.2f%n", 2.0 * quantidade);
        case 5 -> System.out.printf("Total: R$ %.2f%n", 1.5 * quantidade);
      }
    }
  }
}