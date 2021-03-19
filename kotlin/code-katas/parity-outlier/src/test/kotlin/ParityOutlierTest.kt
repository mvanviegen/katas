import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.assertFails
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ParityOutlierTest {
    private lateinit var parityOutlier: ParityOutlier

    @BeforeEach
    internal fun setUp() {
        parityOutlier = ParityOutlier()
    }

    @Test
    internal fun `should throw exception given list with less than three units`() {
        val result =
            assertFails {
                parityOutlier find arrayOf(1, 2)
            }.message

        assertThat(result).isEqualTo("Supplied list must contain atleast three units")
    }

    @Test
    internal fun `should return the even number given list of odd numbers`() {
        val result = parityOutlier find arrayOf(1, 2, 3)

        assertThat(result).isEqualTo(2)
    }

    @Test
    internal fun `should return the odd number given list of even numbers`() {
        val numbers = arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)
        val result = parityOutlier find numbers

        assertThat(result).isEqualTo(206847684)
    }

    @Test
    internal fun `should return 17 apparently`() {
        val numbers = arrayOf(
            17,
            6,
            8,
            10,
            6,
            12,
            24,
            36
        )

        val result = parityOutlier find numbers

        assertThat(result).isEqualTo(17)
    }
}