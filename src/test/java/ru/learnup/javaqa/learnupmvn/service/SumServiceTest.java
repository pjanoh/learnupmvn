package ru.learnup.javaqa.learnupmvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumServiceTest {

    @Test
    public void shouldSkipNegatives() {
        int[] temps = { 0, -10, 10, 20 };

        int expected = 30;
        int actual = SumService.sumPositives(temps);

        Assertions.assertEquals(expected, actual);
    }
}
