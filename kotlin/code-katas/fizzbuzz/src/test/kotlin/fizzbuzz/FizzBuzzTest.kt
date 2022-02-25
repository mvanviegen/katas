package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    @Test
    internal fun `should return string given no multiplicatives`() {
        val result = FizzBuzz().parse(1)

        assertThat(result).isEqualTo("1")
    }
}
