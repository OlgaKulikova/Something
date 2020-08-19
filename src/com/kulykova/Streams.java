package com.kulykova;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("Bcd");
        list.add("Cde");
        List<String> strings = list.subList(0, list.size());
        System.out.println(strings);

        List<String> result = list.stream()
            .filter(String::isEmpty)
            .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println(result);
        }
    }
}
