package gildedrose.domain

class CommonItem(
  name: String,
  sellIn: Int,
  quality: Int,
) : Item(name, sellIn, quality) {
  fun update() {
    updateQuality(this)
    updateSellIn(this)
  }

  private fun updateSellIn(item: CommonItem) {
    item.sellIn -= 1
  }

  private fun updateQuality(item: CommonItem) {
    if (item.quality > 0) item.quality -= 1
  }
}
