package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldCalculateRemainIfTestFailed() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2589;

        int actual = service.remain(amount);
        int expected = 10;

        assertEquals(actual, );
    }

    @Test
    void shouldCalculateRemainIfAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmountNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateRemainIfAmount2589() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2589;

        int actual = service.remain(amount);
        int expected = 411;

        assertEquals(actual, expected);
    }
}
