package com.gildedrose.items;

public class ConjuredItem extends Item {

    public ConjuredItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public void updateQuality() {

        this.sellIn -= 1;

        if(this.quality > 0) {
            reduceQualityBy(1);
        }

        if(this.quality > 0) {
            reduceQualityBy(1);
        }

        if(isPastSellByDate()) {
            if(this.quality > 0) {
                reduceQualityBy(1);
            }
            if(this.quality > 0) {
                reduceQualityBy(1);
            }
        }

    }
}
