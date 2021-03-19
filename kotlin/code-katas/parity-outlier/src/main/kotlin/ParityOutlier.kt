internal class ParityOutlier {
    infix fun find(numbers: Array<Int>): Int {
        require(numbers.size >= 3) {
            "Supplied list must contain atleast three units"
        }
        return findOutlier(numbers)
    }

    private fun findOutlier(numbers: Array<Int>) =
        if (numbers.isEvenList()) {
            numbers.first { it.isOdd() }
        } else {
            numbers.first { it.isEven() }
        }
}

private fun Array<Int>.isEvenList(): Boolean {
    return this[0].isEven() && this[1].isEven() || this[0].isEven() && this[2].isEven()
}

private fun Int.isEven(): Boolean {
    return this % 2 == 0
}

private fun Int.isOdd(): Boolean {
    return this % 2 != 0
}