package beecrowd;

import java.util.Scanner;

public class Ex1066 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int par = 0;
    int impar = 0;
    int positivo = 0;
    int negativo = 0;

    int[] numero = new int[5];
    numero[0] = sc.nextInt();
    numero[1] = sc.nextInt();
    numero[2] = sc.nextInt();
    numero[3] = sc.nextInt();
    numero[4] = sc.nextInt();

    for (int i=0; i<5; i++) {
      if ((numero[i] % 2) == 0 && (numero[i] > 0)) {
        par++;
        positivo++;
      } else if ((numero[i] % 2) != 0 && (numero[i] > 0)) {
        impar++;
        positivo++;
      } else if ((numero[i] % 2) == 0 && (numero[i] < 0)) {
        par++;
        negativo++;
      } else if ((numero[i] % 2) != 0 && (numero[i] < 0)) {
        impar++;
        negativo++;
      } else if ((numero[i]) == 0) {
        par++;
      }
    }

    System.out.println(par + " valor(es) par(es)");
    System.out.println(impar + " valor(es) impar(es)");
    System.out.println(positivo + " valor(es) positivo(s)");
    System.out.println(negativo + " valor(es) negativo(s)");

    sc.close();
 }
}
