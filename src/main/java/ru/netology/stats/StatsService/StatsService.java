package ru.netology.stats.StatsService;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {

                long sale = 0;
                for (int i = 0; i < sales.length; i++) {
                    sale = sale + sales[i];
                }
                return (int) sale;
    }

    public int averageSales(int[] sales) {

        long sale = 0;
        long averageSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sale = sale + sales[i];
            averageSale = sale / 12;
        }
        return (int) averageSale;
    }

    public int aboveAverageSale(int[] sales) {
        int averageSale = averageSales(sales);
        int aboveAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
           if (sales[i] < averageSale)
               aboveAverageMonth++;
        }
        return aboveAverageMonth;
    }

    public int belowAverageSale(int[] sales) {
        int averageSale = averageSales(sales);
        int belowAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale)
                belowAverageMonth++;
        }
        return belowAverageMonth;
    }

}
