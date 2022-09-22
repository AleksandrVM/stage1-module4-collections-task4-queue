package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> orderedDishes = new ArrayList<>();
        Queue<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++)
            dishes.offer(i);
        int count = 1;
        while (dishes.size() != 0){
            if (count % everyDishNumberToEat != 0){
                dishes.offer(dishes.poll());
            }
            else {
                orderedDishes.add(dishes.poll());
            }
            count++;
        }
        return orderedDishes;
    }
}
