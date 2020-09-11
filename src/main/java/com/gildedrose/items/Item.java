package com.gildedrose.items;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public int MAX_QUALITY = 50;
    public int MIN_QUALITY = 0;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {};

    boolean isPastSellByDate() {
        return this.sellIn < 0;
    }

    void increaseQuality() {
        if(this.quality < MAX_QUALITY) {
            this.quality += 1;
        }
    }

    void reduceQuality() {
        if(this.quality > MIN_QUALITY) {
            this.quality -= 1;
        }
    }

    void reduceSellIn() {
        this.sellIn -= 1;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
