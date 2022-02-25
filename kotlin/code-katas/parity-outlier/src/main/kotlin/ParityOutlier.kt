internal class ParityOutlier {
    fun findOutlier(input: List<Int>): Int {
        require(input.size >= 3) { "Input should contain at least three or more items" }

        return input.filter { it % 2 == 0 }.first()
    }
}
