package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	
    @Test
    public void it_must_reduce_quality_by_one_for_a_normal_item_not_expired() {
    		GildedRose gildedRose=new GildedRoseBuilder()
    				.withNormalItem()
    				.notExpired()
    				.withQuality(1)
    				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_1_for_a_not_expired_aged_brie() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withAgedBrie()
				.notExpired()
				.withQuality(1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 2);
    }

    @Test
    public void it_must_reduce_quality_by_2_for_a_normal_item_if_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withNormalItem()
				.expired()
				.withQuality(1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_2_for_an_aged_brie_that_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withAgedBrie()
				.expired()
				.withQuality(1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 3);
    }

    @Test
    public void it_must_set_quality_to_0_for_a_backstage_that_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.expired()
				.withQuality(50)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_2_if_a_backstage_has_less_than_11_sellin() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.withSellin(10)
				.withQuality(1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 3);
    }

    @Test
    public void it_must_increase_quality_by_2_if_a_backstage_has_less_than_6_sellin() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.withSellin(5)
				.withQuality(1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 4);
    }

    @Test
    public void it_must_increase_only_by_1_if_a_backstage_has_quality_49() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.withSellin(5)
				.withQuality(49)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 50);
    }

    
    @Test
    public void it_must_decrease_quality_by_2_if_a_normal_item_is_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withNormalItem()
				.withSellin(-1)
				.withQuality(2)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 0);
    }    
    
    @Test
    public void it_must_not_change_quality_if_is_sulfuras_not_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withSulfuras()
				.notExpired()
				.withQuality(50)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 50);
    }    

    @Test
    public void it_must_not_change_quality_if_is_sulfuras_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withSulfuras()
				.expired()
				.withQuality(49)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 49);
    }    

    @Test
    public void it_must_not_change_quality_if_is_negative() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withNormalItem()
				.withQuality(-1)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, -1);
    }    

    @Test
    public void it_must_increase_quiality_by_one_if_is_aged_brie_expired() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withAgedBrie()
				.expired()
				.withQuality(49)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 50);
    }    

    @Test
    public void it_must_increase_Backstage_by_one_if_has_sellim_greater_than_11() {
		GildedRose gildedRose=new GildedRoseBuilder()
				.withBackstage()
				.withSellin(12)
				.withQuality(40)
				.build();   	
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality, 41);
    }    
    
}
