package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulphurasTest {

    @Test
    public void staysTheSame() {
        Item sulphuras = new Sulphuras("Sulfuras, Hand of Ragnaros", 5, 5);
        sulphuras.updateQuality();
        assertEquals(5, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }

    @Test
    public void qualityCanBeMoreThanFifty() {
        Item sulphuras = new Sulphuras("Sulfuras, Hand of Ragnaros", 5, 80);
        sulphuras.updateQuality();
        assertEquals(80, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }

    @Test
    //todo
    public void ifZero_staysTheSame() {
        Item sulphuras = new Sulphuras("Sulfuras, Hand of Ragnaros", 5, 0);
        sulphuras.updateQuality();
        assertEquals(0, sulphuras.quality);
        assertEquals(5, sulphuras.sellIn);
    }
}
