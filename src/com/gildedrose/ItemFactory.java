package com.gildedrose;

public class ItemFactory {
	
	public NormalItem create(Item item) {
		if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new Sulfuras(item);
		}
		if (item.name.equals("Aged Brie")) {
			return new AgedBrie(item);
		}
		if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new BackstagePasses(item);
		}
		if (item.name.equals("Conjured")) {
			return new Conjured(item);
		}
		
		return new NormalItem(item);
	}
}
