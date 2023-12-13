package java06;

public class GuGuDanEx {
  public static void main(String[] args) {
    int[][] gugudan = new int [10][10];

    for (int i = 1; i < gugudan.length; i++) {
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println(i + "단");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      for(int j = 1; j < gugudan[i].length; j++) {
        gugudan[i][j] = i * j;
        System.out.println(i + "x" + j + "=" + gugudan[i][j]);
        if(j == 9) {
          System.out.println("\n");
        }
      }
    }
  }
}