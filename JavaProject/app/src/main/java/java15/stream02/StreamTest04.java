package java15.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest04 {
    public static void main(String[] args) {
        // int[] -> List<Integer>
        int[] arr = { 33, 55, 88 };

        List<Integer> list1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        for (Integer integer : list1) {
            System.out.println(integer);
        }

        System.out.println(list1.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //
        List<Integer> list2 = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        for (Integer integer : list2) {
            System.out.println(integer);
        }

        System.out.println(list2.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
