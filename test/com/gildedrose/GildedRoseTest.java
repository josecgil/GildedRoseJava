package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void it_must_reduce_quality_by_one_for_a_normal_item() {
        Item[] items = new Item[] { new Item("Normal Item", 1, 1) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_1_for_an_aged_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 1) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].quality, 2);
    }

    @Test
    public void it_must_reduce_quality_by_2_for_a_normal_item_if_is_expired() {
        Item[] items = new Item[] { new Item("Normal Item", -1, 2) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].quality, 0);
    }

    @Test
    public void it_must_increase_quality_by_2_for_an_aged_brie_that_is_expired() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 1) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].quality, 3);
    }

    @Test
    public void it_must_set_quality_to_0_for_a_backstage_that_is_expired() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].quality, 0);
    }

    
}
