package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    public void beforeSellByDate_qualityDegradesByOne() {

        Item item = new Item("foo", 1, 10);
        Item normalItem = new NormalItem(item);

        normalItem.updateQuality();

        assertEquals(9, normalItem.quality);
        assertEquals(0, normalItem.sellIn);
    }

    @Test
    public void afterSellByDate_qualityDegradesTwiceAsFast() {

        Item item = new Item("foo", 0, 10);
        Item normalItem = new NormalItem(item);

        normalItem.updateQuality();

        assertEquals(8, normalItem.quality);
        assertEquals(-1, normalItem.sellIn);
    }

    @Test
    public void ifZero_staysZero() {

        Item item = new Item("foo", 5, 0);
        Item normalItem = new NormalItem(item);

        normalItem.updateQuality();

        assertEquals(0, normalItem.quality);
        assertEquals(4, normalItem.sellIn);
    }

}
