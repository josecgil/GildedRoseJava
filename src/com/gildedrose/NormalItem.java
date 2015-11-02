package com.gildedrose;

public class NormalItem extends Item {
	
	public NormalItem(Item item) {
		super(item.name, item.sellIn, item.quality);
	}

	protected void decreaseQuality() {
        if (quality <= 0) return; 
        quality--;
    }
	
	protected void increaseQuality() {
        if (quality >= 50) return; 
        quality++;
    }

	public void updateQuality() {
        decreaseQuality();
        sellIn--;
        if (sellIn < 0) {
        		decreaseQuality();
        }
	}


}
