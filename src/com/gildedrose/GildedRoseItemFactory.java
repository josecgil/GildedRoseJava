package com.gildedrose;

public class GildedRoseItemFactory {
	
	public GildedRoseItem create(Item item) {
		if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new Sulfuras(item);
		}
		if (item.name.equals("Aged Brie")) {
			return new AgedBrie(item);
		}
		return new GildedRoseItem(item);
	}
}
