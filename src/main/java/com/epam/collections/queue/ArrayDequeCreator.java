package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(firstQueue.poll());
        arrayDeque.addLast(firstQueue.poll());
        arrayDeque.addLast(secondQueue.poll());
        arrayDeque.addLast(secondQueue.poll());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            playerMove(arrayDeque, firstQueue);
            playerMove(arrayDeque, secondQueue);
        }
        return arrayDeque;
    }

    private void playerMove(Deque<Integer> deck, Queue<Integer> hand){
        hand.add(deck.pollLast());
        deck.offerLast(hand.poll());
        deck.offerLast(hand.poll());
    }
}
