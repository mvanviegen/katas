internal class ParityOutlier {
    fun findOutlier(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.get(0)
    }
}
