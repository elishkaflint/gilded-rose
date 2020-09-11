package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void agedBrie_increasesInQuality() {
        Item agedBrie = new AgedBrie("Aged Brie", 5, 5);
        agedBrie.updateQuality();
        assertEquals(6, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void qualityCannotBeMoreThanFifty() {
        Item agedBrie = new AgedBrie("Aged Brie", 5, 50);
        agedBrie.updateQuality();
        assertEquals(50, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void ifZero_increasesInQuality() {
        Item agedBrie = new AgedBrie("Aged Brie", 5, 0);
        agedBrie.updateQuality();
        assertEquals(1, agedBrie.quality);
        assertEquals(4, agedBrie.sellIn);
    }

    @Test
    public void afterSellbyDate_increasesInQualityByTwo() {
        Item agedBrie = new AgedBrie("Aged Brie", 0, 5);
        agedBrie.updateQuality();
        assertEquals(7, agedBrie.quality);
        assertEquals(-1, agedBrie.sellIn);
    }

}
