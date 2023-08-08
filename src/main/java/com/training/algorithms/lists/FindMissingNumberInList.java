package com.training.algorithms.lists;

public class FindMissingNumberInList {
    public int findMissingNumberInList(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        return expectedSum - sum;
    }
}
