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
            Item currentItem = items[i];
            
			if (currentItem.name.equals("Aged Brie") || currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        			increaseQuality(currentItem);
            } else {
                if (currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {

                } else {
                    decreaseQuality(currentItem);
                }
            }

            if (currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (currentItem.sellIn < 11) {
            			increaseQuality(currentItem);
                }
                if (currentItem.sellIn < 6) {
            			increaseQuality(currentItem);
                }
            }
            
            if (currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {

            } else {
                currentItem.sellIn--;
            }

            if (currentItem.sellIn < 0) {
                if (currentItem.name.equals("Aged Brie")) {
        				increaseQuality(currentItem);
                } else {
                    if (currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        currentItem.quality = 0;
                    } else {
                        if (currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {

                        } else {
                            decreaseQuality(currentItem);
                        }
                    }
                }
            }
        }
    }
}
