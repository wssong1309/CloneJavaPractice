package java03;

public class ContinueEx {
  public static void main(String[] args) {
    int i;
    for(i = 1; i <= 10; i++){
      if(i % 2 == 0){
        continue;
      }
      else System.out.print(i + " ");
    }
  }
}
