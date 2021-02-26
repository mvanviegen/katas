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
        character: Char
    ) =
        if (!stringOccurences.containsKey(character)) {
            stringOccurences.put(character, false)
        } else {
            stringOccurences.put(character, true)
        }

    private fun evaluateCharacter(
        stringOccurences: MutableMap<Char, Boolean>,
        character: Char
    ) =
        if (stringOccurences[character] == true) {
            ")"
        } else {
            "("
        }
}
