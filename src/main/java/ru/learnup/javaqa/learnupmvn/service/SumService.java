package ru.learnup.javaqa.learnupmvn.service;

public class SumService {

    public static int sumPositives(int[] temps) {
        int sum = 0;
        for (int t : temps) {
            if (t > 0) {
                sum += t;
            }
        }
        return sum;
    }
}
