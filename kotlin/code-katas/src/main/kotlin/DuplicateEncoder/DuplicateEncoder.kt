package DuplicateEncoder

class DuplicateEncoder {
    fun encode(string: String): String {
        val stringOccurences = string.groupingBy { it.toLowerCase() }.eachCount()

        return string.map { stringOccurences.getValue(it) }
            .map(::evaluateCharacter)
            .joinToString("")
    }

    private fun evaluateCharacter(it: Int) =
        if (it == 1) {
            "("
        } else {
            ")"
        }
}
