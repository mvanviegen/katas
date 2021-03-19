import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class ParityOutlierTest {
    @Test
    internal fun `should return the even number given list of odd numbers`() {
        val result = ParityOutlier().findOutlier(listOf(1, 2, 3))

        assertThat(result).isEqualTo(2)
    }
}