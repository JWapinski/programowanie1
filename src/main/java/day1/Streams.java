package day1;


import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArray(10, 10)));
        System.out.println(Arrays.toString(generateArray(10, 50)));
        System.out.println(Arrays.toString(generateArray(10, 100)));

        int[] array = generateArray(10_000_000, 1_000);
        // Arrays.stream(array).filter(number -> number <= 10).forEach(System.out::println);

        array = new int[]{0, 0, 0, 0, 0, 10, 10, 0, 10};

        List<Integer> listOfIntegers = Arrays.stream(array)
                .filter(number -> number <= 10)
                .boxed()
                .collect(Collectors.toList());

        Map<Integer, Integer> map2 = new HashMap<>();
        for (Integer integer : listOfIntegers) {
            map2.put(integer, map2.containsKey(integer) ? map2.get(integer) + 1 : 1);
        }

        System.out.println(map2);

        // policzyc wystapienia liczb od 0 do 10 i je wyswietlic
        Map<Integer, Long> map = Arrays.stream(array)
                .filter(number -> number <= 10)
                .boxed()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));

        System.out.println(map);


        boolean isPresent = Arrays.stream(array)
                .filter(number -> number == 0)
                .boxed()
                .findAny()
                .isPresent();

        System.out.println(isPresent);
    }


    // napisz metode, ktora zwraca tablice intow - generateArray(size, range)
    static public int[] generateArray(int size, int range) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range);
        }

        return array;
    }

}


