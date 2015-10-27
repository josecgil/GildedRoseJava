package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private void decreaseQuality(Item item) {
        if (item.quality <= 0) return; 
        item.quality--;
    }

    private void increaseQuality(Item item) {
        if (item.quality >= 50) return; 
        item.quality++;
    }
    
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {

                    } else {
                        decreaseQuality(items[i]);
                    }
                }
            } else {
            		increaseQuality(items[i]);
            }

            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].sellIn < 11) {
            			increaseQuality(items[i]);
                }
                if (items[i].sellIn < 6) {
            			increaseQuality(items[i]);
                }
            }
            
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {

            } else {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
	                            decreaseQuality(items[i]);
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
            			increaseQuality(items[i]);
                }
            }
        }
    }
}
