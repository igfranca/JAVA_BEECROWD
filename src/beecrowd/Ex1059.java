package beecrowd;

public class Ex1059 {
  public static void main(String[] args) {

    for (int i=1; i<=100 ;i++) {
      int par = i % 2;
      if (par == 0){
        System.out.println(i);
      }
    }
  }
}
