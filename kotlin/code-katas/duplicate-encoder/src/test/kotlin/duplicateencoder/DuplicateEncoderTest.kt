package duplicateencoder

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class DuplicateEncoderTest {
    @Test
    internal fun `should return ( for each letter given no duplication within string`() {
        val result = DuplicateEncoder("din").encode()
        assertThat(result).isEqualTo("(((")
    }

    @Test
    internal fun `should return ) for each letter given duplication within string`() {
        val result = DuplicateEncoder("dinN").encode()
        assertThat(result).isEqualTo("(())")
    }

    @Test
    internal fun `should return ()()()`() {
        val result = DuplicateEncoder("recede").encode()
        assertThat(result).isEqualTo("()()()")
    }

    @Test
    internal fun `should return )())())`() {
        val result = DuplicateEncoder("Success").encode()
        assertThat(result).isEqualTo(")())())")
    }

    @Test
    internal fun `should return ))((`() {
        val result = DuplicateEncoder("(( @").encode()
        assertThat(result).isEqualTo("))((")
    }
}
