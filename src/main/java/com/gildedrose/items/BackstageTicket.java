package com.gildedrose.items;

public class BackstageTicket extends Item {

    public BackstageTicket(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {

        this.sellIn -= 1;

        if(isPastSellByDate()) {
            this.quality = 0;
        } else {
            if(this.quality < 50) {
                increaseQualityBy(1);
            }
            if (this.sellIn < 10) {
                if(this.quality < 50) {
                    increaseQualityBy(1);
                }
            }
            if (this.sellIn < 5) {
                if(this.quality < 50) {
                    increaseQualityBy(1);
                }
            }
        }
    }
}
