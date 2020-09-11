package com.gildedrose.items;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {};

    boolean isPastSellByDate() {
        return this.sellIn < 0;
    }

    void increaseQualityBy(int amount) {
        this.quality += amount;
    }

    void reduceQualityBy(int amount) {
        this.quality -= amount;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
