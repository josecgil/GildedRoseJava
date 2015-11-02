package com.gildedrose;

public class NormalItem extends Item {
	
	public NormalItem(Item item) {
		super(item.name, item.sellIn, item.quality);
	}

	protected void decreaseQuality() {
		decreaseQuality(1);
    }

	protected void decreaseQuality(int delta) {
		if (quality<=0) return;
		quality=quality-delta;
		if (quality<0) {
			quality=0;
		}
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
