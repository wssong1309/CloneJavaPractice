package java15.stream02;

import java.util.ArrayList;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        // List<Integer> -> int[]
        List<Integer> lists = new ArrayList<>();
        lists.add(33);
        lists.add(77);
        lists.add(99);

        // (1) 직접 int[]를 생성하여 입력하는 방법
        int[] arr1 = new int[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            arr1[i] = lists.get(i).intValue();
            System.out.println(arr1[i]);
        }

        System.out.println(arr1.getClass().getTypeName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // (2) 방법 : Lambda Expression

        // (3) 방법 : Method Reference
        
    }
}
