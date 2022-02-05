package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    internal fun `should print Fizz given multiples of three`() {
        val result = fizzBuzz.parse(listOf(3, 9))

        println(result)
        assertThat(result).isEqualTo("Fizz, Fizz")
    }

    @Test
    internal fun `should print Buzz given multiples of five`() {
        val result = fizzBuzz.parse(listOf(5, 10))

        assertThat(result).isEqualTo("Buzz, Buzz")
    }

    @Test
    internal fun `should not parse given no three or five multiplicatives`() {
        val result = fizzBuzz.parse(listOf(1, 2, 4))

        assertThat(result).isEqualTo("1, 2, 4")
    }

    @Test
    internal fun `should print FizzBuzz given multiples of fifteen`() {
        val result = fizzBuzz.parse(listOf(15))

        assertThat(result).isEqualTo("FizzBuzz")
    }
}
