package DuplicateEncoder

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class DuplicateEncoderTest {
    @Test
    internal fun `should return ( for each letter given no duplication within string`() {
        val result = DuplicateEncoder().encode("din")
        assertThat(result).isEqualTo("(((")
    }
}
