package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    internal fun `should print Fizz given multiples of three`() {
        assertThat(fizzBuzz.parse(3)).isEqualTo("Fizz")
    }

    @Test
    internal fun `should print Buzz given multiples of five`() {
        val result = fizzBuzz.parse(5)

        assertThat(result).isEqualTo("Buzz")
    }

    @Test
    internal fun `should not parse given no three or five multiplicatives`() {
        val result = fizzBuzz.parse(1)

        assertThat(result).isEqualTo("1")
    }
}
