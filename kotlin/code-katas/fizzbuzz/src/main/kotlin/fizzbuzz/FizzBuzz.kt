package fizzbuzz

class FizzBuzz {
    fun parse(input: List<Int>): String {
        return input.map {
            var result = it.toString()
            if(it % 3 == 0) result = "Fizz"
            if(it % 5 == 0) result = "Buzz"
            if(it % 15 == 0) result = "FizzBuzz"
            result
        }.joinToString(", ")
    }
}

fun main() : Unit {
}
