package fizzbuzz

class FizzBuzz {
    fun parse(input: Int): String {
        if(input == 3) return "Fizz"
        if(input == 5) return "Buzz"
        return input.toString()
    }
}

fun main() : Unit {
}
