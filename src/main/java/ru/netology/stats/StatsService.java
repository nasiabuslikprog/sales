package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int salesSum = 0;
        for (int sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public int averageAmount(int[] sales) {

        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(int[] sales) {
        int belowAverageSales = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                belowAverageSales = belowAverageSales + 1;
            }
        }
        return belowAverageSales;
    }

    public int numberMonthsAboveAverage(int[] sales) {
        int aboveAverageSales = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                aboveAverageSales = aboveAverageSales + 1;
            }
        }
        return aboveAverageSales;
    }
}

