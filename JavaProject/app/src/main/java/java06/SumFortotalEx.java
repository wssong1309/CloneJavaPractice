package java06;

public class SumFortotalEx {
  public static void main(String[] args) {
    int[] scores = {100, 90, 50, 92, 81, 77};
    int sum = 0;

    for (int score : scores) {
      sum += score;
    }
    System.out.println("총점 : " + sum);
    
    double avg = (double) sum / scores.length;
    System.out.println("평균 : " + avg);
  }
}