package java15.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest01 {
    public static void main(String[] args) {
        // int (Primitive Data Type) 형태의 array를 이용
        // (1) 중복 제거, (2) 내림차순 정렬, (3) List Collection Type으로 반환

        int[] arr = { 3, 2, 11, 22, 3, 2, 33, 44 };
        List<Integer> lists = new ArrayList<>();
        Set<Integer> sets = new HashSet<>();

        // [1] Stream을 사용하지 않을경우
        // (1) 중복을 허용하지 않는 set(중복 제거)
        for (int i = 0; i < arr.length; i++) {
            sets.add(arr[i]);
        }

        // for (int i = 0; i < arr.length; i++) {
        // lists.add(arr[i]);
        // }

        // (2) 내림차순 정렬
        Iterator<Integer> iterator = sets.iterator();
        while (iterator.hasNext()) {
            // (3) List Collection Type으로 반환
            lists.add(iterator.next());
        }

        lists.sort(Comparator.reverseOrder());

        System.out.println("[1] Stream을 사용하지 않고 출력: " + lists.toString());

        // [2] Stream을 사용하는 경우
        // boxed() method는 IntStream과 같이 Primitive Data Type에 대한 Stream지원을 하는 Class Type (IntStream -> Stream<Integer>)으로 변환하여 전용으로 실행 가능한 기능을 수행
        System.out.println("[2] Stream을 사용하고 출력: " +
                Arrays.stream(arr)
                        .boxed()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList()));
    }
}
