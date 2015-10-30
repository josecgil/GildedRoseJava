package com.gildedrose;

class GildedRose {
    Item[] items;
    private GildedRoseItemFactory itemFactory=new GildedRoseItemFactory();
    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            GildedRoseItem currentItem=itemFactory.create(items[i]);
            currentItem.updateQuality();
        		items[i] = currentItem;   
        }
    }
}
