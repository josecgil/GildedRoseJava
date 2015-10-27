package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseBuilder {

	private static final int NOT_EXPIRED_SELLIN = 50;
	private static final int EXPIRED_SELLIN = -1;
	private static final int DEFAULT_QUALITY = 1;
	private static final int DEFAULT_SELLIN = 1;
	private List<Item> items=new ArrayList<Item>();
	
	public GildedRoseBuilder withNormalItem() {
		items.add(new Item("Normal Item", DEFAULT_QUALITY, DEFAULT_SELLIN));
		return this;
	}

	public GildedRoseBuilder withAgedBrie() {
		items.add(new Item("Aged Brie", DEFAULT_QUALITY, DEFAULT_SELLIN));
		return this;
	}
	
	public GildedRoseBuilder withBackstage() {
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", DEFAULT_QUALITY, DEFAULT_SELLIN));
		return this;
	}
	
	public GildedRoseBuilder withSulfuras() {
		items.add(new Item("Sulfuras, Hand of Ragnaros", 50, DEFAULT_SELLIN));
		return this;
	}

	private Item getLastItem() {
		return items.get(items.size()-1);
	}

	public GildedRoseBuilder notExpired() {
		this.getLastItem().sellIn=NOT_EXPIRED_SELLIN;
		return this;
	}

	public GildedRoseBuilder expired() {
		this.getLastItem().sellIn=EXPIRED_SELLIN;
		return this;
	}

	public GildedRoseBuilder withQuality(int quality) {
		this.getLastItem().quality=quality;
		return this;
	}

	public GildedRoseBuilder withSellin(int sellIn) {
		this.getLastItem().sellIn=sellIn;
		return this;
	}

	public GildedRose build() {
		return new GildedRose(this.items.toArray(new Item[this.items.size()]));
	}



}
