package com.gildedrose;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Nested
    class NormalItem {

        @Test
        public void beforeSellByDate_qualityDegradesByOne() {
            Item[] items = new Item[] { new Item("foo", 1, 10) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(9, app.items[0].quality);
            assertEquals(0, app.items[0].sellIn);
        }

        @Test
        public void afterSellByDate_qualityDegradesTwiceAsFast() {
            Item[] items = new Item[] { new Item("foo", 0, 10) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(8, app.items[0].quality);
            assertEquals(-1, app.items[0].sellIn);
        }

        @Test
        public void ifZero_staysZero() {
            Item[] items = new Item[] { new Item("foo", 5, 0) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(0, app.items[0].quality);
            assertEquals(4, app.items[0].sellIn);
        }

    }

    @Nested
    class AgedBrie {

        @Test
        public void agedBrie_increasesInQuality() {
            Item[] items = new Item[] { new Item("Aged Brie", 5, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(6, app.items[0].quality);
            assertEquals(4, app.items[0].sellIn);
        }

        @Test
        public void qualityCannotBeMoreThanFifty() {
            Item[] items = new Item[] { new Item("Aged Brie", 5, 50) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(50, app.items[0].quality);
            assertEquals(4, app.items[0].sellIn);
        }

        @Test
        public void ifZero_increasesInQuality() {
            Item[] items = new Item[] { new Item("Aged Brie", 5, 0) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(1, app.items[0].quality);
            assertEquals(4, app.items[0].sellIn);
        }

    }

    @Nested
    public class Sulfuras {

        @Test
        public void staysTheSame() {
            Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(5, app.items[0].quality);
            assertEquals(5, app.items[0].sellIn);
        }

        @Test
        public void qualityCanBeMoreThanFifty() {
            Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(80, app.items[0].quality);
            assertEquals(5, app.items[0].sellIn);
        }

        @Test
        //todo
        public void ifZero_staysTheSame() {
            Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 0) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(0, app.items[0].quality);
            assertEquals(5, app.items[0].sellIn);
        }

    }

    @Nested
    public class BackstagePass {

        @Test
        public void whenSellInMoreThan10Days_increaseByOne() {
            Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(6, app.items[0].quality);
            assertEquals(10, app.items[0].sellIn);
        }

        @Test
        public void whenSellIn10Days_increaseByTwo() {
            Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(7, app.items[0].quality);
            assertEquals(9, app.items[0].sellIn);
        }

        @Test
        public void whenSellIn5Days_increaseByThree() {
            Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(8, app.items[0].quality);
            assertEquals(4, app.items[0].sellIn);
        }

        @Test
        public void afterConcert_zeroQuality() {
            Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(0, app.items[0].quality);
            assertEquals(-1, app.items[0].sellIn);
        }

        @Test
        public void ifZero_increasesInQuality() {
            Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0) };
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(1, app.items[0].quality);
            assertEquals(10, app.items[0].sellIn);
        }

    }

}
