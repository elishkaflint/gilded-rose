package com.gildedrose;

public class BackstageTicket extends Item {

    public BackstageTicket(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

        this.sellIn -= 1;

        if(isPastSellByDate()) {
            this.quality = 0;
        } else {
            if(this.quality < 50) {
                increaseQuality();
            }
            if (this.sellIn < 10) {
                increaseQuality();
            }
            if (this.sellIn < 5) {
                increaseQuality();
            }
        }
    }
}
