package com.gildedrose;

public class AgedBrie extends NormalItem {

	public AgedBrie(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		increaseQuality();
	    sellIn--;
        if (sellIn < 0) {
        		increaseQuality();
        }
	}
	
	
	
}
