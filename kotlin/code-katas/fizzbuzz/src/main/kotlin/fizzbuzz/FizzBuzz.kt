package fizzbuzz

class FizzBuzz {
    infix fun parse(input: List<Int>) =
        input
            .map(::parseIndividual)
            .joinToString("\n")

    private fun parseIndividual(value: Int) =
        when {
            value % 15 == 0 -> "FizzBuzz"
            value % 3 == 0 -> "Fizz"
            value % 5 == 0 -> "Buzz"
            else -> value.toString()
        }
}

fun main(): Unit {
}
