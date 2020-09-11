package com.gildedrose.items;

public class BackstageTicket extends Item {

    public BackstageTicket(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {

        reduceSellIn();

        if(isPastSellByDate()) {
            this.quality = 0;
        } else {
            increaseQuality();
            if (this.sellIn < 10) {
                increaseQuality();
            }
            if (this.sellIn < 5) {
                increaseQuality();
            }
        }
    }
}
