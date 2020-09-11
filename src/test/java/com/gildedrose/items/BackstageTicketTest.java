package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageTicketTest {

    @Test
    public void whenSellInMoreThan10Days_increaseByOne() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(6, backstageTicket.quality);
        assertEquals(10, backstageTicket.sellIn);
    }

    @Test
    public void whenSellIn10Days_increaseByTwo() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(7, backstageTicket.quality);
        assertEquals(9, backstageTicket.sellIn);
    }

    @Test
    public void whenSellIn5Days_increaseByThree() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(8, backstageTicket.quality);
        assertEquals(4, backstageTicket.sellIn);
    }

    @Test
    public void afterConcert_zeroQuality() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(0, backstageTicket.quality);
        assertEquals(-1, backstageTicket.sellIn);
    }

    @Test
    public void ifZero_increasesInQuality() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(1, backstageTicket.quality);
        assertEquals(10, backstageTicket.sellIn);
    }

    @Test
    public void afterFifty_doesNotIncreaseInQuality() {

        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49);
        Item backstageTicket = new BackstageTicket(item);

        backstageTicket.updateQuality();

        assertEquals(50, backstageTicket.quality);
        assertEquals(2, backstageTicket.sellIn);
    }

}
