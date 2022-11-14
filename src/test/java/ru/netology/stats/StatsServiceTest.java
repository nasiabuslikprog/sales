package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expectedSales, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 8;
        int actual = service.maxSales(sales);
        assertEquals(expectedSales, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 9;
        int actual = service.minSales(sales);
        assertEquals(expectedSales, actual);
    }

    @Test
    void shouldCalculateNumberMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actual = service.numberMonthsBelowAverage(sales);
        assertEquals(expectedSales, actual);
    }

    @Test
    void shouldCalculateNumberMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actual = service.numberMonthsAboveAverage(sales);
        assertEquals(expectedSales, actual);
    }
}
