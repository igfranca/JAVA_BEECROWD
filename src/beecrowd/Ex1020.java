package beecrowd;

import java.util.Scanner;

public class Ex1020 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N, resto, ano365, mes30, dia;
    N = sc.nextInt();

    ano365 = N / 365;
    resto = N % 365;
    mes30 = resto / 30;
    dia = resto % 30;

    System.out.println(ano365 + " ano(s)");
    System.out.println(mes30 + " mes(es)");
    System.out.println(dia + " dia(s)");

  }
}
