package gildedrose.domain

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
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

    @Nested
    inner class UpdateQuality {

        @Test
        internal fun `should decrease sell by days and quality by one`() {
            var item = CommonItem("Sword", 15, 1)
            item.update()

            assertAll {
                assertThat(item.name).isEqualTo("Sword")
                assertThat(item.sellIn).isEqualTo(14)
                assertThat(item.quality).isEqualTo(0)
            }
        }

        @Test
        internal fun `should not decrease quality below zero`() {
            var item = CommonItem("Sword", 15, 0)
            item.update()

            assertThat(item.quality).isEqualTo(0)
        }
    }
}
