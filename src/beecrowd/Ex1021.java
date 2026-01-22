package beecrowd;

import java.util.Scanner;

public class Ex1021 {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      double valor = scanner.nextDouble();

      // Converte tudo para centavos para evitar erros de ponto flutuante
      int totalCentavos = (int) Math.round(valor * 100);

      int cem = totalCentavos / 10000;
      totalCentavos %= 10000;

      int cinquenta = totalCentavos / 5000;
      totalCentavos %= 5000;

      int vinte = totalCentavos / 2000;
      totalCentavos %= 2000;

      int dez = totalCentavos / 1000;
      totalCentavos %= 1000;

      int cinco = totalCentavos / 500;
      totalCentavos %= 500;

      int dois = totalCentavos / 200;
      totalCentavos %= 200;

      int umReal = totalCentavos / 100;
      totalCentavos %= 100;

      int cinquentaCentavos = totalCentavos / 50;
      totalCentavos %= 50;

      int vinteCincoCentavos = totalCentavos / 25;
      totalCentavos %= 25;

      int dezCentavos = totalCentavos / 10;
      totalCentavos %= 10;

      int cincoCentavos = totalCentavos / 5;
      totalCentavos %= 5;

      int umCentavo = totalCentavos;

      System.out.println("NOTAS:");
      System.out.println(cem + " nota(s) de R$ 100.00");
      System.out.println(cinquenta + " nota(s) de R$ 50.00");
      System.out.println(vinte + " nota(s) de R$ 20.00");
      System.out.println(dez + " nota(s) de R$ 10.00");
      System.out.println(cinco + " nota(s) de R$ 5.00");
      System.out.println(dois + " nota(s) de R$ 2.00");

      System.out.println("MOEDAS:");
      System.out.println(umReal + " moeda(s) de R$ 1.00");
      System.out.println(cinquentaCentavos + " moeda(s) de R$ 0.50");
      System.out.println(vinteCincoCentavos + " moeda(s) de R$ 0.25");
      System.out.println(dezCentavos + " moeda(s) de R$ 0.10");
      System.out.println(cincoCentavos + " moeda(s) de R$ 0.05");
      System.out.println(umCentavo + " moeda(s) de R$ 0.01");
    }
  }
}

