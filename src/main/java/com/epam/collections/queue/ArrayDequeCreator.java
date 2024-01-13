package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> ans = new ArrayDeque<>();
        ans.addLast(Objects.requireNonNull(firstQueue.poll()));
        ans.addLast(Objects.requireNonNull(firstQueue.poll()));
        ans.addLast(Objects.requireNonNull(secondQueue.poll()));
        ans.addLast(Objects.requireNonNull(secondQueue.poll()));
        while (!firstQueue.isEmpty()) {
            firstQueue.add(ans.pollLast());
            ans.addLast(Objects.requireNonNull(firstQueue.poll()));
            ans.addLast(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.add(ans.pollLast());
            ans.addLast(Objects.requireNonNull(secondQueue.poll()));
            ans.addLast(Objects.requireNonNull(secondQueue.poll()));
        }
        return ans;
    }
}
