package com.gildedrose;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void testMultipleItems() {

        Item agedBrie = new Item("Aged Brie", 5, 5);
        Item backstageTicket = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5);
        Item normalItem = new Item("foo", 1, 10);
        Item sulphuras = new Item("Sulfuras, Hand of Ragnaros", 5, 5);

        Item[] items = new Item[] {agedBrie, backstageTicket, normalItem, sulphuras};

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(6, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[1].quality);
        assertEquals(10, app.items[1].sellIn);
        assertEquals(9, app.items[2].quality);
        assertEquals(0, app.items[2].sellIn);
        assertEquals(5, app.items[3].quality);
        assertEquals(5, app.items[3].sellIn);

    }

}
