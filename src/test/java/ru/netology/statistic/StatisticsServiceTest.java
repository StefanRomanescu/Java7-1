package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

   @Test
   void findBiggestMax(){
       StatisticsService service = new StatisticsService();

       long[] incomesInBillions = {30, 16, 12, 15, 8, 98, 0};
       long expected =98;

       long actual = service.findMax(incomesInBillions);

       Assertions.assertEquals(expected, actual);
   }

}