package beecrowd;

import java.util.Scanner;

public class Ex1021_Erro {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double valor = sc.nextDouble();

    double total, cem, cinquenta, vinte, dez, cinco, dois, umReal;
    double cinquentaCentavos, vinteCincoCentavos, dezCentavos, cincoCentavos, umCentavo;

    cem = (float) valor / 100;
    total = valor % 100;

    cinquenta = (float) total / 50;
    total = total % 50;

    vinte = (float) total / 20;
    total = total % 20;

    dez = (float) total / 10;
    total = total % 10;

    cinco = (float) total / 5;
    total = total % 5;

    dois = (float) total / 2;
    total = total % 2;

    umReal = total;
    total = total % 1;

    cinquentaCentavos = (float) total / 0.50;
    total = total % 0.50;

    vinteCincoCentavos = (float) total / 0.25;
    total = total % 0.25;

    dezCentavos = (float) total / 0.10;
    total = total % 0.10;

    cincoCentavos = (float) total / 0.05;
    total = total % 0.05;

    umCentavo = (float) total / 0.01;
    total = total % 0.01;

    System.out.println("NOTAS:");
    System.out.printf("%.0f notas(s) de R$ 100.00", cem);
    System.out.printf("\n%.0f notas(s) de R$ 50.00", cinquenta);
    System.out.printf("\n%.0f notas(s) de R$ 20.00", vinte);
    System.out.printf("\n%.0f notas(s) de R$ 10.00", dez);
    System.out.printf("\n%.0f notas(s) de R$ 5.00", cinco);
    System.out.printf("\n%.0f notas(s) de R$ 2.00", dois);

    System.out.println();
    System.out.println("MOEDAS:");
    System.out.printf("%.0f moeda(s) de R$ 1.00", umReal);
    System.out.printf("\n%.0f moeda(s) de R$ 0.50", cinquentaCentavos);
    System.out.printf("\n%.0f moeda(s) de R$ 0.25", vinteCincoCentavos);
    System.out.printf("\n%.0f moeda(s) de R$ 0.10", dezCentavos);
    System.out.printf("\n%.0f moeda(s) de R$ 0.05", cincoCentavos);
    System.out.printf("\n%.0f moeda(s) de R$ 0.01", umCentavo);

    sc.close();
  }
}
