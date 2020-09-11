package com.gildedrose.items;

public class ConjuredItem extends Item {

    public ConjuredItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public void updateQuality() {

        this.sellIn -= 1;

        reduceQuality();
        reduceQuality();

        if(isPastSellByDate()) {
            reduceQuality();
            reduceQuality();
        }

    }
}
