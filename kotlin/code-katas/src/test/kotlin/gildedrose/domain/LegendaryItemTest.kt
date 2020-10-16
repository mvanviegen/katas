package gildedrose.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class LegendaryItemTest {
    @Test
    internal fun `should create a legendary item`() {
        val item = LegendaryItem("Sulfuras", 10)
        assertThat(item.name).isEqualTo("Sulfuras")
        assertThat(item.quality).isEqualTo(10)
        assertThat(item.toString()).isEqualTo("Sulfuras, 10, 0")
    }
}
