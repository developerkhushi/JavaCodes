package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEasy {
    public static void main(String[] args) {

//        1.  Convert an array of integers to a list using streams.
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.toList());

//        2.  Use a lambda to print each element of a list.
        res.forEach(x -> System.out.println(x));

//        3.  Filter even numbers from a list using streams.
        List<Integer> list = Arrays.asList(2, 4, 8, 5, 0, 9, 6);
        list.stream().filter(x -> x % 2 == 0).toList().forEach(System.out::println);

//        4.  Convert a list of strings to uppercase using streams.
        List<String> names = Arrays.asList("Khushboo", "Bharti", "Maahi", "Mohit", "Sweety");
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);

//        5.  Count the number of elements in a list using streams.
        System.out.println(list.stream().count());

//        6.  Sort a list of integers using streams.
        list.stream().sorted().toList().forEach(System.out::println);

//        8.  Find the first element in a stream.
        System.out.println(list.stream().findFirst().orElse(null));
         // OR
        list.stream().findFirst().ifPresent(System.out::println);

//        9.  Use map to square each number in a list.
        list.stream().map(x -> x * x).toList().forEach(System.out::println);

//        10. Filter strings that start with a specific letter.
        names.stream().filter(x -> x.startsWith("M")).toList().forEach(System.out::println);

//        12. Convert a string array to a list and filter by length.
        String[] students = {"Ram", "Shyam", "Sita"};
        List<String> s = Arrays.stream(students)
                                .filter(x -> x.length() > 3)
                                .toList();
        s.forEach(System.out::println);

//        13. Use anyMatch to check if any string contains "Java".
        List<String> strs = Arrays.asList("Spring", "Java", "Docker", "Kotlin");
        boolean result = strs.stream()
                .anyMatch(x -> x.contains("Java"));
        System.out.println(result);

//        14. Use allMatch to check if all numbers are positive.
        System.out.println(list.stream().allMatch(x -> x >= 0));

//        15. Use noneMatch to check if no string is empty.
        System.out.print(strs.stream().noneMatch(x -> x.isEmpty()));

    }
}
