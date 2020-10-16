package gildedrose.domain

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CommonItemTest {
    @Test
    internal fun `should create a common item`() {
        val item = CommonItem("Sword", 15, 10)
        assertThat(item.name).isEqualTo("Sword")
        assertThat(item.sellIn).isEqualTo(15)
        assertThat(item.quality).isEqualTo(10)
        assertThat(item.toString()).isEqualTo("Sword, 15, 10")
    }

    @Test
    internal fun `should throw error given too high a quality`() {
        val result = assertThrows<IllegalArgumentException> {
            CommonItem("UltraLegendary", 1, 55)
        }.message

        assertThat(result).isEqualTo("Items cannot be of higher quality than 50!")
    }

    @Nested
    inner class UpdateQuality {

        @Test
        internal fun `should decrease sell by days and quality by one`() {
            val item = CommonItem("Sword", 15, 1)
            item.update()

            assertAll {
                assertThat(item.name).isEqualTo("Sword")
                assertThat(item.sellIn).isEqualTo(14)
                assertThat(item.quality).isEqualTo(0)
            }
        }

        @Test
        internal fun `should not decrease quality below zero`() {
            val item = CommonItem("Sword", 15, 0)
            item.update()

            assertThat(item.quality).isEqualTo(0)
        }

        @Test
        internal fun `should not decrease quality below zero when sell in days has been reached`() {
            val item = CommonItem("Sword", 0, 1)
            item.update()

            assertThat(item.quality).isEqualTo(0)
        }

        @Test
        internal fun `should decrease quality in two given sell by days has been reached`() {
            val item = CommonItem("Sword", 0, 10)
            item.update()

            assertThat(item.quality).isEqualTo(8)
        }
    }
}
