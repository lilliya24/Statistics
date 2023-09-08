package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maximumMonth(long[] sales) {
        int monthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSale]) {
                monthMaximumSale = i;
            }
        }
        return monthMaximumSale + 1;
    }

    public int minimumMonth(long[] sales) {
        int monthMinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimumSale]) {
                monthMinimumSale = i;
            }
        }
        return monthMinimumSale + 1;

    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}


