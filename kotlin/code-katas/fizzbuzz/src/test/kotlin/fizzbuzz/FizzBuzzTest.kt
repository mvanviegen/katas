package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    internal fun `should return string given no multiplicatives`() {
        val result = fizzBuzz.parse(1)

        assertThat(result).isEqualTo("1")
    }

    @Test
    internal fun `should return Fizz given multiplicatives of three`() {
        val result = fizzBuzz.parse(3)

        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    internal fun `should return Buzz given multiplicatives of five`() {
        val result = fizzBuzz.parse(5)

        assertThat(result).isEqualTo("Buzz")
    }

    @Test
    internal fun `should return FizzBuzz given multiplicatives of fifteen`() {
        val result = fizzBuzz.parse(15)

        assertThat(result).isEqualTo("FizzBuzz")
    }

    @Test
    internal fun `should return multiple parsed results given a list of inputs`() {
        val input = (1..50).toList()

        val result = fizzBuzz.parse(input)

        assertThat(result).isEqualTo("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "Fizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "28\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "Buzz\n" +
                "Fizz\n" +
                "37\n" +
                "38\n" +
                "Fizz\n" +
                "Buzz\n" +
                "41\n" +
                "Fizz\n" +
                "43\n" +
                "44\n" +
                "FizzBuzz\n" +
                "46\n" +
                "47\n" +
                "Fizz\n" +
                "49\n" +
                "Buzz")
    }
}
