import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ParityOutlierTest {
    private lateinit var parityOutlier: ParityOutlier

    @BeforeEach
    internal fun setUp() {
        parityOutlier = ParityOutlier()
    }

    @Test
    internal fun `should return the even number given list of odd numbers`() {
        val result = parityOutlier find listOf(1, 2, 3)

        assertThat(result).isEqualTo(2)
    }

    @Test
    internal fun `should return the odd number given list of even numbers`() {
        val numbers = listOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)
        val result = parityOutlier find numbers

        assertThat(result).isEqualTo(206847684)
    }
}