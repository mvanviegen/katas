package gildedrose.domain

class LegendaryItem(
    name: String,
    quality: Int,
    sellIn: Int = 0,
) : Item(name, sellIn, quality) {
}
