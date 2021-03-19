internal class ParityOutlier {
    infix fun find(numbers: List<Int>): Int {
        require(numbers.size >= 3) {
            "Supplied list must contain atleast three units"
        }

        // check whether given list is (mostly) even or odd
        val evenArray = (numbers[0].isEven() && numbers[1].isEven()) || (numbers[0].isEven() && numbers[2].isEven())

        return if (evenArray) {
            // even array; should filter out non-even number
            numbers.filter { it.isOdd() }.first()
        } else {
            // odd array; should filter out even number
            numbers.filter { it.isEven() }.first()
        }
    }
}

private fun List<Int>.isEven() {

}

private fun Int.isEven(): Boolean {
    return this % 2 == 0
}

private fun Int.isOdd(): Boolean {
    return this % 2 != 0
}