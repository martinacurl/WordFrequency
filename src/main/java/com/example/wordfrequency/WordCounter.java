package com.example.wordfrequency;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    public Map<String, Long> getFrequency(String str) {
        Stream<String> stream = Stream.of(str.toLowerCase().split("[.,\\s!;?:\"]+")).parallel();

        Map<String, Long> wordFreq =
                stream.collect(Collectors.groupingBy
                                (String::toString, Collectors.counting()));

        Map<String, Long> topTen =
                wordFreq.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return topTen;

    }

}



