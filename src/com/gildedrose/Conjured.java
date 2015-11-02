package com.gildedrose;

public class Conjured extends NormalItem {
	public Conjured(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
        decreaseQuality();
        decreaseQuality();
        sellIn--;
        if (sellIn < 0) {
        		decreaseQuality();
            decreaseQuality();
        }		
	}
}
