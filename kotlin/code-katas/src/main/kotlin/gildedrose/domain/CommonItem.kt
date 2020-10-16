package gildedrose.domain

class CommonItem(
  name: String,
  sellIn: Int,
  quality: Int,
) : Item(name, sellIn, quality) {
  fun updateQuality(): CommonItem {
    return CommonItem(name, sellIn - 1, quality - 1)
  }
}
