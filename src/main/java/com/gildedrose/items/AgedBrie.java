package com.gildedrose.items;

public class AgedBrie extends Item {

    public AgedBrie(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {

        this.sellIn -= 1;

        if(this.quality < 50) {
            increaseQuality();
        }

        if(isPastSellByDate()) {
            if(this.quality < 50) {
                increaseQuality();
            }
        }
    }

}
