package com.gildedrose;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void testMultipleItems() {
        Item agedBrie = new com.gildedrose.AgedBrie("Aged Brie", 5, 5);
        Item backstageTicket = new BackstageTicket("Backstage passes to a TAFKAL80ETC concert", 11, 5);
        Item normalItem = new com.gildedrose.NormalItem("foo", 1, 10);
        Item[] items = new Item[] {agedBrie, backstageTicket, normalItem};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[1].quality);
        assertEquals(10, app.items[1].sellIn);
        assertEquals(9, app.items[2].quality);
        assertEquals(0, app.items[2].sellIn);

    }

}
