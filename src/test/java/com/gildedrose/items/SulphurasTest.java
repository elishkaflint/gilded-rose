package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulphurasTest {

    @Test
    public void staysTheSame() {

        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 5);
        Item sulphuras = new Sulphuras(item);

        sulphuras.updateQuality();

        assertEquals(5, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }

    @Test
    public void qualityCanBeMoreThanFifty() {

        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
        Item sulphuras = new Sulphuras(item);

        sulphuras.updateQuality();

        assertEquals(80, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }

    @Test
    //todo
    public void ifZero_staysTheSame() {

        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 0);
        Item sulphuras = new Sulphuras(item);

        sulphuras.updateQuality();

        assertEquals(0, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }
}
