internal class ParityOutlier {
    infix fun find(numbers: List<Int>): Int {
        // check whether given list is (mostly) even or odd

        val evenArray = (numbers[0].isEven() && numbers[1].isEven()) || (numbers[0].isEven() && numbers[2].isEven())

        if (evenArray) {
            // even array; should filter out non-even number
            return numbers.filter { it.isOdd() }.first()
        }

        val oddArray = (numbers[0].isOdd() && numbers[1].isOdd()) || (numbers[0].isOdd() && numbers[2].isOdd())

        if (oddArray) {
            // even array; should filter out non-even number
            return numbers.filter { it.isEven() }.first()
        }

        return numbers.first()
    }
}

private fun Int.isEven(): Boolean {
    return this % 2 == 0
}

private fun Int.isOdd(): Boolean {
    return this % 2 != 0
}