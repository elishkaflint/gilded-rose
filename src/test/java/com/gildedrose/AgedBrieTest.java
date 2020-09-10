package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void test() {
        Item agedBrie = new AgedBrie("Aged Brie", 5, 10);
        agedBrie.updateQuality();
        assertEquals(11, agedBrie.quality);
    }

}
