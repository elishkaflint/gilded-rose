package com.gildedrose;

public class BackstageTicket extends Item {

    public BackstageTicket(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn -= 1;
        this.quality += 1;
    }
}
