package com.gildedrose;

public class GildedRoseItemFactory {
	
	public GildedRoseItem create(Item item) {
		if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new Sulfuras(item);
		}
		if (item.name.equals("Aged Brie")) {
			return new AgedBrie(item);
		}
		if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new BackstagePasses(item);
		}
		
		return new GildedRoseItem(item);
	}
}
