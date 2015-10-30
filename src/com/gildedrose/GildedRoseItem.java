package com.gildedrose;

public class GildedRoseItem extends Item {
	
	public GildedRoseItem(Item item) {
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
		if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			increaseQuality();
	    } else {
	        decreaseQuality();
	    }
	
	    if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
	        if (sellIn < 11) {
	    			increaseQuality();
	        }
	        if (sellIn < 6) {
	    			increaseQuality();
	        }
	    }
	    
        sellIn--;
	
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (sellIn < 0) {
            		quality = 0;
            }
        } else {
            if (sellIn < 0) {
            		decreaseQuality();
            }
        }

		
	}


}
