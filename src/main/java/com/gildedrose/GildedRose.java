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
            }

            if (!isAgedBrie(i) && !isBackstagePass(i)) {
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (isBackstagePass(i)) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            items[i].sellIn = items[i].sellIn - 1;

            if (isPastSellByDate(i)) {
                if (!isAgedBrie(i)) {
                    if (!isBackstagePass(i)) {
                        if (items[i].quality > 0) {
                            items[i].quality = items[i].quality - 1;
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
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
}