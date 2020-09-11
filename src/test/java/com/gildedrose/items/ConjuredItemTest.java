package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {


    @Test
    public void beforeSellByDate_qualityDegradesByTwo() {

        Item item = new Item("Conjured Mana Cake", 10, 10);
        Item conjuredItem = new ConjuredItem(item);

        conjuredItem.updateQuality();

        assertEquals(8, conjuredItem.quality);
        assertEquals(9, conjuredItem.sellIn);
    }

    @Test
    public void afterSellByDate_qualityDegradesByFour() {

        Item item = new Item("Conjured Mana Cake", 0, 10);
        Item conjuredItem = new ConjuredItem(item);

        conjuredItem.updateQuality();

        assertEquals(6, conjuredItem.quality);
        assertEquals(-1, conjuredItem.sellIn);
    }

    @Test
    public void qualityCannotGoBelowZero() {

        Item item = new Item("Conjured Mana Cake", 6, 1);
        Item conjuredItem = new ConjuredItem(item);

        conjuredItem.updateQuality();

        assertEquals(0, conjuredItem.quality);
        assertEquals(5, conjuredItem.sellIn);
    }

}
