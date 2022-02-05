package fizzbuzz

class FizzBuzz {
    infix fun parse(input: List<Int>) =
        input.map {
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }.joinToString(", ")
}

fun main(): Unit {
}
