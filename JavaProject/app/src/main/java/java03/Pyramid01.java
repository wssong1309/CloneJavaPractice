package java03;

public class Pyramid01 {
  public static void main(String[] args) {
    /*
     * 1) System.out.println("*"); k
     * 2) System.out.println(" "); i, j;
     */
    int i, j, k;
    int num = 6;

    // [1] 반쪽 Tree
    // for(i=0; i<6; i++) {
    //   for(j=0; j<=i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // [2] 완전한 tree
    for(i=0; i<=num; i++){
      for(j=0; j<num-i; j++){
        System.out.print(" ");
      }
      for(k=0; k<i*2+1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
