internal class ParityOutlier {
    infix fun find(numbers: List<Int>): Int {
        // check whether given list is (mostly) even or odd

        if ((numbers[0] % 2 == 0 && numbers[1] % 2 == 0) || (numbers[0] % 2 == 0 && numbers[2] % 2 == 0)) {
            // even array; should filter out non-even number
            return numbers.filter { it % 2 != 0 }.get(0)
        }

        if ((numbers[0] % 2 != 0 && numbers[1] % 2 != 0) || (numbers[0] % 2 != 0 && numbers[2] % 2 != 0)) {
            // even array; should filter out non-even number
            return numbers.filter { it % 2 == 0 }.get(0)
        }

        return numbers.get(0)
    }
}
