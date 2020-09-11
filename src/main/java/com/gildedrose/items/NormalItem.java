package com.gildedrose.items;

public class NormalItem extends Item{

    public NormalItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {

        reduceSellIn();

        reduceQuality();

        if(isPastSellByDate()) {
            reduceQuality();
        }

    }
}
