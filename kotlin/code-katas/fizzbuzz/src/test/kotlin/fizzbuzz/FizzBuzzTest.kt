package fizzbuzz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    internal fun `should print Fizz given multiples of three`() {
        val result = fizzBuzz parse listOf(3, 9)

        assertThat(result).isEqualTo("Fizz\nFizz")
    }

    @Test
    internal fun `should print Buzz given multiples of five`() {
        val result = fizzBuzz parse listOf(5, 10)

        assertThat(result).isEqualTo("Buzz\nBuzz")
    }

    @Test
    internal fun `should not parse given no three or five multiplicatives`() {
        val result = fizzBuzz parse listOf(1, 2, 4)

        assertThat(result).isEqualTo("1\n2\n4")
    }

    @Test
    internal fun `should print FizzBuzz given multiples of fifteen`() {
        val result = fizzBuzz parse listOf(15, 30)

        assertThat(result).isEqualTo("FizzBuzz\nFizzBuzz")
    }

    @Test
    internal fun `should parse correctly given 1 to 100`() {
        val result = fizzBuzz parse (1..100).toList()

        assertThat(result).isEqualTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\nFizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz\n61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\nFizz\n73\n74\nFizzBuzz\n76\n77\nFizz\n79\nBuzz\nFizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz\n91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz")
    }
}
