package fizzbuzz

class FizzBuzz {
    fun parse(input: Int): String {
        if(input % 15 == 0){
            return "FizzBuzz"
        } else if(input % 5 == 0){
            return "Buzz"
        } else if(input % 3 == 0) {
            return "Fizz"
        }

        return input.toString()
    }

    fun parse(input: List<Int>): String {
        return input.map(::parse).joinToString("\n")
    }
}

fun main() {

}
