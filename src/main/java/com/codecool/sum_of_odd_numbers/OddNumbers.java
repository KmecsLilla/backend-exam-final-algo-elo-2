package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        int accumulator = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (Math.abs(numbers.get(i) % 2) == 1) {
                accumulator += numbers.get(i);
            }
        }
        return accumulator;
    }
}