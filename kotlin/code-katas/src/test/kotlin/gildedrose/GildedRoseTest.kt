package gildedrose

import gildedrose.domain.Item
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GildedRoseTest {
    @Test
    fun `should decrease amount of sell by days and quality of a common item`() {
        val items = arrayOf(Item("foo", 1, 1))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("foo", app.items[0].name)
        assertEquals(0, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)
    }

    @Test
    fun `should not decrease amount of quality below zero`() {
        val items = arrayOf(Item("foo", 1, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("foo", app.items[0].name)
        assertEquals(0, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)
    }
}
