package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> ans = new PriorityQueue<>(Collections.reverseOrder());
        ans.addAll(firstList);
        ans.addAll(secondList);
        return ans;
    }
}
