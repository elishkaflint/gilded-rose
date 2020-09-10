package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    public void test() {
        Item normalItem = new NormalItem("foo", 5, 5);
        normalItem.updateQuality();
        assertEquals(6, normalItem.quality);
        assertEquals(4, normalItem.sellIn);
    }

}
