package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return -1 * s1.compareTo(s2);
            }
        });
        queue.addAll(firstList);
        queue.addAll(secondList);
        return queue;
    }
}
