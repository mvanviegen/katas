package gildedrose.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class CommonItemTest {
    @Test
    internal fun `should create a common item`() {
        val item = CommonItem("Sword", 15, 10)
        assertThat(item.name).isEqualTo("Sword")
        assertThat(item.sellIn).isEqualTo(15)
        assertThat(item.quality).isEqualTo(10)
        assertThat(item.toString()).isEqualTo("Sword, 15, 10")
    }
}
