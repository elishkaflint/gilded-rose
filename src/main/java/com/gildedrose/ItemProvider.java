package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstageTicket;
import com.gildedrose.items.Item;
import com.gildedrose.items.NormalItem;
import com.gildedrose.items.Sulphuras;

public class ItemProvider {

    public static Item getItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageTicket(item);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulphuras(item);
            default:
                return new NormalItem(item);
        }
    }

}
