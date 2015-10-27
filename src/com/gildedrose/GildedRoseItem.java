package com.gildedrose;

public class GildedRoseItem extends Item {
	
	public GildedRoseItem(Item item) {
		super(item.name, item.sellIn, item.quality);
	}

	private void decreaseQuality() {
        if (quality <= 0) return; 
        quality--;
    }

    private void increaseQuality() {
        if (quality >= 50) return; 
        quality++;
    }

	public void updateQuality() {
		if (name.equals("Aged Brie") || name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			increaseQuality();
	    } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
	
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
	    
	    if (name.equals("Sulfuras, Hand of Ragnaros")) {
	
	    } else {
	        sellIn--;
	    }
	
	    if (sellIn < 0) {
	        if (name.equals("Aged Brie")) {
					increaseQuality();
	        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
	            quality = 0;
	        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
	
	        } else {
	            decreaseQuality();
	        }
	    }
		
	}


}
