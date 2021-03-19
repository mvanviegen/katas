internal class ParityOutlier {
    infix fun find(numbers: List<Int>): Int {
        // check whether given list is (mostly) even or odd

        if ((numbers[0].isEven() && numbers[1].isEven()) || (numbers[0].isEven() && numbers[2].isEven())) {
            // even array; should filter out non-even number
            return numbers.filter { it % 2 != 0 }.get(0)
        }

        if ((numbers[0].isOdd() && numbers[1].isOdd()) || (numbers[0].isOdd() && numbers[2].isOdd())) {
            // even array; should filter out non-even number
            return numbers.filter { it % 2 == 0 }.get(0)
        }

        return numbers.get(0)
    }
}

private fun Int.isEven(): Boolean {
    return this % 2 == 0
}

private fun Int.isOdd(): Boolean {
    return this % 2 != 0
}