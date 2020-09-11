package com.gildedrose.items;

public class NormalItem extends Item{

    public NormalItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {

        this.sellIn -= 1;

        reduceQuality();

        if(isPastSellByDate()) {
                reduceQuality();
        }

    }
}
