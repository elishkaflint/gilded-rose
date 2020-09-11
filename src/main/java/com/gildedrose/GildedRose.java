package com.gildedrose;

import com.gildedrose.items.Item;

import static com.gildedrose.ItemProvider.getItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = getItem(items[i]);
            item.updateQuality();
            items[i] = item;
        }
    }

}