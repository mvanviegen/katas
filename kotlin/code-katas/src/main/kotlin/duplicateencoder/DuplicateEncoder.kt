package duplicateencoder

class DuplicateEncoder(
    string: String
) {
    private val string = string.toLowerCase()
    private val occurrences = buildOccurences(this.string)

    fun encode() = string
        .map{
            evaluateCharacter(occurrences, it)
        }
        .joinToString("")

    private fun buildOccurences(
        string: String,
    ): MutableMap<Char, Boolean> {
        val stringOccurences: MutableMap<Char, Boolean> = mutableMapOf()
        string
            .map {
                verifyStringOccurence(stringOccurences, it)
            }
        return stringOccurences
    }

    private fun verifyStringOccurence(
        stringOccurences: MutableMap<Char, Boolean>,
        it: Char
    ) =
        if (!stringOccurences.containsKey(it)) {
            stringOccurences.put(it, false)
        } else {
            stringOccurences.put(it, true)
        }

    private fun evaluateCharacter(
        stringOccurences: MutableMap<Char, Boolean>,
        it: Char
    ) =
        if (stringOccurences[it] == true) {
            ")"
        } else {
            "("
        }
}
