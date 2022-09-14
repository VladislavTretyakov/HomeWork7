package ru.netology.stats.StatsServiceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.StatsService;

public class StatsServiceTest {

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 9;
        int actualSale = service.minSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 8;
        int actualSale = service.maxSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 180;
        int actualSale = service.sumSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 15;
        int actualSale = service.averageSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void aboveAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 5;
        int actualSale = service.aboveAverageSale(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void belowAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSale = 5;
        int actualSale = service.belowAverageSale(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

}
