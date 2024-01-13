package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        List<Integer> dishesLeft = IntStream.rangeClosed(1, numberOfDishes).boxed().collect(Collectors.toList());
        int dishNumber = everyDishNumberToEat - 1;
        while (dishes.size() != numberOfDishes) {
            dishes.add(dishesLeft.get(dishNumber));
            dishesLeft.remove(dishNumber);
            int counter = everyDishNumberToEat - 1;
            if (dishNumber > dishesLeft.size() - 1) {
                dishNumber = 0;
            }
            while (counter != 0) {
                dishNumber++;
                if (dishNumber >= dishesLeft.size()) {
                    dishNumber = 0;
                }
                counter--;
            }
        }
        return dishes;
    }
}
