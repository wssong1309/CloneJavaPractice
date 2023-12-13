package java15.stream02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        // int[] -> IntStream -> Stream<Integer> -> Integer[]
        int[] smart = { 33, 55, 88 };

        // (1) int[] -> Stream
        IntStream stream = Arrays.stream(smart);

        // (2) IntStream -> Stream<Integer>
        Stream<Integer> boxed = stream.boxed();

        // (3) Stream<Integer> -> Integer[]
        Integer[] result = boxed.toArray(Integer[]::new);

        System.out.println(Arrays.toString(result));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // (4) (1)+(2)+(3) 한줄로 실행하는 방법
        Integer[] smartOne = Arrays.stream(smart)
                .boxed()
                .toArray(Integer[]::new);
                
        for (Integer integer : smartOne) {
            System.out.println(integer);
        }
        System.out.println(smartOne.getClass().getTypeName());
    }
}
