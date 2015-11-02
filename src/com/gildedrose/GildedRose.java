package com.gildedrose;

class GildedRose {
    Item[] items;
    private ItemFactory itemFactory=new ItemFactory();
    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            NormalItem currentItem=itemFactory.create(items[i]);
            currentItem.updateQuality();
        		items[i] = currentItem;   
        }
    }
}
