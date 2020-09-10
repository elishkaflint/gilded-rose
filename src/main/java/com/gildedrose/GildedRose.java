package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {

            if(isSulfuras(i)) {
                continue;
            } else if(isAgedBrie(i)) {
                if(items[i].quality < 50) {
                    increaseQuality(i);
                }
            } else if(isBackstagePass(i)) {
                if(items[i].quality < 50) {
                    increaseQuality(i);
                }
                if (items[i].sellIn < 11) {
                    increaseQuality(i);
                }
                if (items[i].sellIn < 6) {
                    increaseQuality(i);
                }
            } else {
                reduceQuality(i);
            }

            items[i].sellIn = items[i].sellIn - 1;

            if (isPastSellByDate(i)) {
                if (!isAgedBrie(i)) {
                    if (!isBackstagePass(i)) {
                        reduceQuality(i);
                   } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    increaseQuality(i);
                }
            }
        }
    }

    private boolean isAgedBrie(int i) {
        return items[i].name.equals("Aged Brie");
    }

    private boolean isBackstagePass(int i) {
        return items[i].name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras(int i) {
        return items[i].name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isPastSellByDate(int i) {
        return items[i].sellIn < 0;
    }

    private void reduceQuality(int i) {
        if (items[i].quality > 0) {
            items[i].quality = items[i].quality - 1;
        }
    }

    private void increaseQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

}