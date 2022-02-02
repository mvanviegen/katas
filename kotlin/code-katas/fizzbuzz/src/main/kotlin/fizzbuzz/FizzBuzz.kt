package fizzbuzz

class FizzBuzz {
    fun translate(input: List<Int>): String {
        val result = input.map { number ->

            if( number % 15 == 0 ) {
                "FizzBuzz"
            } else if( number % 5 == 0 ) {
                "Buzz"
            } else if( number % 3 == 0 ) {
                "Fizz"
            } else {
                number.toString()
            }

        }.joinToString(", ")

        println(result)
        return result
    }
}

fun main() {
    FizzBuzz().translate(listOf(1, 2, 3, 4))
}
