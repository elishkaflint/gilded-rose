package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    public void beforeSellByDate_qualityDegradesByOne() {
        Item normalItem = new NormalItem("foo", 1, 10);
        normalItem.updateQuality();
        assertEquals(9, normalItem.quality);
        assertEquals(0, normalItem.sellIn);
    }

    @Test
    public void afterSellByDate_qualityDegradesTwiceAsFast() {
        Item normalItem = new NormalItem("foo", 0, 10);
        normalItem.updateQuality();
        assertEquals(8, normalItem.quality);
        assertEquals(-1, normalItem.sellIn);
    }

    @Test
    public void ifZero_staysZero() {
        Item normalItem = new NormalItem("foo", 5, 0);
        normalItem.updateQuality();
        assertEquals(0, normalItem.quality);
        assertEquals(4, normalItem.sellIn);
    }

}
