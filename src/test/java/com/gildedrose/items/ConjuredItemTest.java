package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {


    @Test
    public void beforeSellByDate_qualityDegradesByOne() {

        Item item = new Item("Conjured Mana Cake", 10, 10);
        Item conjuredItem = new ConjuredItem(item);

        conjuredItem.updateQuality();

        assertEquals(8, conjuredItem.quality);
        assertEquals(0, conjuredItem.sellIn);
    }

}
