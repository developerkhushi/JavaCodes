package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {

    public static void main(String[] args) {
        // Given a List<Integer>, filter all even numbers and collect them into a new list.
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = nums.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        // Find the sum of all numbers in a list using streams.
        int sum = nums.stream().mapToInt(w->w)
                .sum();

        // Use Reduce to sum all elements in a list.
        int summ = nums.stream().reduce((a,b) -> a+b).get();
        System.out.println(result);

        // Convert a List<String> to uppercase using streams.
        List<String> names = Arrays.asList("Khushboo","Bharti","Muskan", "Ajay", "Aman");
        List<String> capitalNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(capitalNames);

        // Find the count of elements greater than 50 in a list.
        List<Integer> elements = Arrays.asList(1,2,356,51,89,12,10);
        Long noOfElements = elements.stream().filter(n -> n > 50).count();
        System.out.println(noOfElements);

        // From a list of strings, filter strings that start with "A".
        List<String> namesA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesA);

        // Print all elements of a list using forEach.
        names.forEach(System.out::println);

        // Find the maximum and minimum element from a list.
        int max = nums.stream().max((a,b) -> a-b).get();
        int min = nums.stream().min(Comparator.comparingInt(a -> a)).get();
        System.out.println(max);
        System.out.println(min);

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // Convert an array of integers to a List<Integer> using streams.
        List<Integer> listFromArray = Arrays.stream(arr).boxed().toList();
        listFromArray.forEach(System.out::print);
    }
}