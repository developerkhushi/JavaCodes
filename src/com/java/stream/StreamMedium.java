package com.java.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamMedium {
    public static void main(String[] args) {
//        1.  Find the maximum value in a list using streams.
        List<Integer> list = Arrays.asList(2, 4, 8, 5, 0, 9, 6, 2, 4);
        int result = list.stream()
                         .max(Comparator.naturalOrder())
                         .orElseThrow();
        System.out.println(result);

//        2.  Use reduce to sum all elements in a list.
        System.out.println(list.stream().reduce(0, Integer::sum));

//        3.  Group strings by their length using Collectors.groupingBy.
        List<String> names = Arrays.asList("Khushboo", "Bharti", "Maahi", "Mohit", "Sweety");
        Map<Integer, List<String>> map = names.stream()
                                              .collect(Collectors.groupingBy(String::length));
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

//        4.  Remove duplicates from a list using distinct().
        list.stream().distinct().toList().forEach(System.out::println);

//        5.  Flatten a list of lists using flatMap.
        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> res = listOfList.stream()
                .flatMap(innerList -> innerList.stream())
                .toList();
        res.forEach(System.out::println);

//        6.  Sort a list of custom objects by a field using streams.
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Khushboo", 90000),
                new Employee(2, "Bharti", 75000),
                new Employee(3, "Sweety", 120000)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .toList();
        sorted.forEach(System.out::println);

//        7.  Filter a list of objects based on a field value.
        List<Employee> filtered = employees.stream()
                .filter(e -> e.salary > 80000)
                .toList();
        filtered.forEach(System.out::println);

//        8.  Count the frequency of each character in a string using streams.
        String strs = "programming";
        Map<Character, Long> freq = strs.chars()
                                     .mapToObj(c -> (char) c)
                                     .collect(Collectors.groupingBy(Function.identity(), counting()));
        System.out.println(freq);


//        9.  Convert a list of strings to a comma-separated string.
        String s = names.stream().collect(Collectors.joining(", "));
        System.out.println(s);


//        10. Use peek to debug stream operations.
        names.stream()
                .peek(x -> System.out.println("Original: " + x))
                .map(String::toUpperCase)
                .peek(x -> System.out.println("After map: " + x))
                .toList();

//        11. Use limit and skip to paginate a list.
        List<String> letter = Arrays.asList(
                "A", "B", "C", "D", "E", "F", "G", "H"
        );
        int pageNumber = 1;
        int pageSize = 3;
        List<String> page = letter.stream()
                                    .skip(pageNumber * pageSize)
                                    .limit(pageSize)
                                    .toList();
        System.out.println(page);

//        12. Use partitioningBy to split a list into two groups.
        Map<Boolean, List<String>> map1 = names.stream()
                                               .collect(Collectors.partitioningBy(x -> x.length() > 6));

        System.out.println(map1);

//        13. Find the longest string in a list using streams.
        Optional<String> longest = names.stream().max(Comparator.comparingInt(String::length));
        longest.ifPresent(System.out::println);

//        14. Use streams to reverse a list.

        System.out.println("Reverse a list: ");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);

//        15. Use Collectors.joining() to concatenate strings.
        String ans = names.stream()
                .collect(Collectors.joining());
        System.out.println(ans);

    }
}
