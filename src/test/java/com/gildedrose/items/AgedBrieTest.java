package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void agedBrie_increasesInQuality() {

        Item item = new Item("Aged Brie", 5, 5);
        Item agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(6, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void qualityCannotBeMoreThanFifty() {

        Item item = new Item("Aged Brie", 5, 50);
        Item agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(50, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void ifZero_increasesInQuality() {

        Item item = new Item("Aged Brie", 5, 0);
        Item agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(1, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void afterSellbyDate_increasesInQualityByTwo() {

        Item item = new Item("Aged Brie", 0, 5);
        Item agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(7, agedBrie.quality);
        assertEquals(-1, agedBrie.sellIn);
    }

}
