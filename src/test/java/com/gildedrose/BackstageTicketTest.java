package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageTicketTest {

    @Test
    public void test() {
        Item backstageTicket = new BackstageTicket("Backstage passes to a TAFKAL80ETC concert", 5, 5);
        backstageTicket.updateQuality();
        assertEquals(6, backstageTicket.quality);
        assertEquals(4, backstageTicket.sellIn);
    }

}
