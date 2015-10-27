package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	
    @Test
    public void it_must_reduce_quality_by_one_for_a_normal_item() {
    		GildedRose gildedRose=new GildedRoseBuilder()
    				.withNormalItem()
    				.notExpired()
    				.andQuality(1)
    				.Build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_1_for_an_aged_brie() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withAgedBrie()
				.notExpired()
				.andQuality(1)
				.Build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 2);
    }

    @Test
    public void it_must_reduce_quality_by_2_for_a_normal_item_if_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withNormalItem()
				.expired()
				.andQuality(1)
				.Build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_2_for_an_aged_brie_that_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withAgedBrie()
				.expired()
				.andQuality(1)
				.Build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 3);
    }

    @Test
    public void it_must_set_quality_to_0_for_a_backstage_that_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.expired()
				.andQuality(50)
				.Build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    
}
