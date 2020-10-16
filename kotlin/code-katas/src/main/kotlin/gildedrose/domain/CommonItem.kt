package gildedrose.domain

class CommonItem(
  name: String,
  sellIn: Int,
  quality: Int,
) : Item(name, sellIn, quality) {
  private val hasQuality = quality > 0
  private val hasExpired = sellIn <= 0
  private val qualityHitOnExpiration = 2

  fun update() {
    updateQuality()
    updateSellIn()
  }

  private fun updateQuality() {
    if (!hasQuality) return
    else if (hasExpired) this.updateQualityAfterExpiration()
    else quality -= 1
  }

  private fun updateQualityAfterExpiration() {
    if (quality >= qualityHitOnExpiration) quality -= qualityHitOnExpiration
    else if (quality < qualityHitOnExpiration) quality = 0
  }

  private fun updateSellIn() {
    sellIn -= 1
  }
}
