package gildedrose.domain

class CommonItem(
  name: String,
  sellIn: Int,
  quality: Int
) : Item(name, sellIn, quality) {
  private val hasQuality = quality > 0
  private val hasExpired = sellIn <= 0
  private val maxQuality = 50
  private val qualityHitOnExpiration = 2
  private val qualityHit = 1

  init {
    require(quality <= maxQuality) {
      "Items cannot be of higher quality than 50!"
    }
  }

  fun update() {
    updateQuality()
    updateSellIn()
  }

  private fun updateQuality() {
    if (!hasQuality) return
    else if (hasExpired) this.updateQualityAfterExpiration()
    else quality -= qualityHit
  }

  private fun updateQualityAfterExpiration() {
    if (quality >= qualityHitOnExpiration) quality -= qualityHitOnExpiration
    else if (quality < qualityHitOnExpiration) quality = 0
  }

  private fun updateSellIn() {
    sellIn -= 1
  }
}
