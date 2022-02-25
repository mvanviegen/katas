import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class ParityOutlierTest {
    @Test
    internal fun `should return error given list count less than three`() {
        val input = emptyList<Int>()

        val result = assertThrows(IllegalArgumentException::class.java) {
            ParityOutlier().findOutlier(input)
        }.message

        assertThat(result).isEqualTo("Input should contain at least three or more items")
    }

    @Test
    internal fun `should return even number given a list of odd numbers`() {
        val input = listOf(1, 3, 5, 6)

        val result = ParityOutlier().findOutlier(input)

        assertThat(result).isEqualTo(6)
    }


}
