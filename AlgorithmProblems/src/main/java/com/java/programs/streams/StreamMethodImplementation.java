package com.java.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.*;

public class StreamMethodImplementation {

    public static void main(String[] args) {
        StreamMethodImplementation streamMethodImplementation = new StreamMethodImplementation();
        //streamMethodImplementation.basicStreamCreations();
        //streamMethodImplementation.sampleArrayListStream();
        streamMethodImplementation.sort();
        //streamMethodImplementation.mapToIntList();
        //streamMethodImplementation.understandBasicFunctions();
    }


    // 1. Basic Stream

    public void streamCreation() {
        List<String> strings = Arrays.asList("str1", "str11", "str2");
        Stream<String> stringStream = strings.stream();
        stringStream.forEach(val -> {
            System.out.println(val);
        });
        stringStream = Stream.of("abc", "cd");

        stringStream.forEach(val -> {
            System.out.println(val);
        });

        IntStream.generate(() -> 1).limit(10).forEach(val -> System.out.println(val));
        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(0,200)).limit(20).forEach(val -> System.out.println(val));
    }

    // 2. map

    public void mapToIntList () {
        List<String> string = Arrays.asList("1","2","3");
        List<Integer> intList = string.stream().map((e -> Integer.parseInt(e))).collect(Collectors.toList());
        System.out.println(intList);
        Integer[] array = string.stream().map((e -> Integer.parseInt(e))).toArray(Integer[]::new);
        for (int i : array) {
            System.out.println(i);
        }
    }


    public void basicStreamCreations() {
        String str = "InputText";
        IntStream intStream = str.chars();
        str.codePoints().mapToObj(c -> String.valueOf((char)c)).forEach(e -> System.out.println(e));
        IntStream.generate(() -> (int) (Math.random() * 10)).forEach(e -> System.out.println(e));
    }

    public void understandBasicFunctions() {
        Supplier<String> strGenerator = () -> {
            Random random = new Random();
            StringBuilder text =  new StringBuilder();
            for (int i = 0; i < 5; i++) {
                text.append((char)(random.nextInt(26) + 'a'));
            }
            return text.toString();
        };

        Consumer<String> strProcessor = str -> {
            System.out.println(str);
        };

        UnaryOperator<String> strConverter= str -> {
            return str.toUpperCase();
        };

//        Consumer<String> strPeek = str -> {
//            str.concat("acd");
//        };

        Stream.generate(strGenerator).limit(10).map(strConverter).forEach(strProcessor);
    }

    public void reduce() {

        List<String> sample =  Arrays.asList("a","b","c");
        List<Integer> sample1 =  Arrays.asList(1,2,3,3);
        System.out.println(sample.stream().findFirst().get());
        //System.out.println(sample1.stream().reduce((v1, v2) -> v1 + v2));
    }

    public void sampleArrayListStream() {
        List<String> strList = Arrays.asList("abc", "bcd", "def");
        strList.stream().filter(e -> e.contains("b")).map(e -> e.concat("efg")).forEach(str -> System.out.println(str));

    }

    public void sort() {
        List<Human> humans = Arrays.asList(
                new Human("Sarah", 12),
                new Human("Sarah", 10),
                new Human("Zack", 12)
        );

        humans.sort(
                Comparator.comparing(Human::getName).thenComparing(Human::getAge)
        );

        for(Human e : humans) {
            System.out.println(e.toString());
        }
    }

}

class Human {
    String name;
    Integer age;

    Human(String s, Integer age) {
        this.name = s;
        this.age = age;
    }

    public String toString() {
        return name +" :" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
