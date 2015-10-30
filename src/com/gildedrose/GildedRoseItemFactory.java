package com.gildedrose;

public class GildedRoseItemFactory {
	
	public GildedRoseItem create(Item item) {
		return new GildedRoseItem(item);
	}

}
