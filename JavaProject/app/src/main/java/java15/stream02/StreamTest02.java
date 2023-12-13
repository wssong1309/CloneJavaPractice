package java15.stream02;

import java.util.ArrayList;
import java.util.List;

public class StreamTest02 {
    public static void main(String[] args) {
        // [1] ArrayList<Integer>를 int Array로 변환
        List<Integer> lists = new ArrayList<>();
        lists.add(33);
        lists.add(55);
        lists.add(88);

        // (1) 방법
        int[] arr1 = new int[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            arr1[i] = lists.get(i).intValue();
            System.out.println(arr1[i]);
        }
        System.out.println(arr1.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // (2) 방법 : Lambda Expression
        int[] arr2 = lists.stream()
                          .mapToInt(i -> i)
                          .toArray();
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println(arr2.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // (3) 방법 : Method Reference
        int[] arr3 = lists.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
        for (int i : arr3) {
            System.out.println(i);
        }
        System.out.println(arr3.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // (4) 방법 : filter method 사용
        int[] arr4 = lists.stream()
                          .filter(i -> i != null)
                          .mapToInt(i -> i)
                          .toArray();
        
        for (int i : arr4) {
            System.out.println(i);
        }
        System.out.println(arr3.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
