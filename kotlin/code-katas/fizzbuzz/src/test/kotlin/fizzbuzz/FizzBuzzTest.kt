package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    @Test
    internal fun `should return the number when number is not divisible by three`() {
        val input = listOf(1, 2)

        val result = FizzBuzz().translate(input)

        assertThat(result).isEqualTo("1, 2")
    }

    @Test
    internal fun `should return the word fizz when number is divisible by three`() {
        val input = listOf(1, 2, 3)

        val result = FizzBuzz().translate(input)

        assertThat(result).isEqualTo("1, 2, Fizz")
    }

    @Test
    internal fun `should return the word buzz when given number is divisible by five`() {
        val input = listOf(1, 2, 5)

        val result = FizzBuzz().translate(input)

        assertThat(result).isEqualTo("1, 2, Buzz")
    }

    @Test
    internal fun `should return the word fizzbuzz when given number is divisible by fifteen`() {
        val input = listOf(1, 2, 15)

        val result = FizzBuzz().translate(input)

        assertThat(result).isEqualTo("1, 2, FizzBuzz")
    }

    @Test
    internal fun `should translate the correct words on given numbers`() {
        val input = (1..100).toList()

        val result = FizzBuzz().translate(input)

        assertThat(result).isEqualTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz")
    }
}