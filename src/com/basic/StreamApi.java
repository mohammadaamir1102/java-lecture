package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"aamir khan","aasim khan","Furqan khan","aamir khan");
        list.stream().filter(a->a.equalsIgnoreCase("furqan khan")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
