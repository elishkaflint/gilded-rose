package com.gildedrose.items;

public class NormalItem extends Item{

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        this.sellIn -= 1;

        if(isPastSellByDate()) {
            if(this.quality > 0) {
                reduceQuality();
            }
        }
        if(this.quality > 0) {
            reduceQuality();
        }
    }
}
