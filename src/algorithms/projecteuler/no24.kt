package algorithms.projecteuler

fun main() {
    val numbers = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    var result = ""
    var num = 1_000_000 - 1

    ((numbers.size - 1) downTo 0).forEach {
        val temp = num / factorial(it) or 0
        num %= factorial(it)
        result += numbers[temp]
        numbers.removeAt(temp)
        println(numbers)
    }
    println(result)
}

fun factorial(n: Int) : Int {
    return if(n == 0) 1
    else (n downTo 1).reduce { acc, i -> acc * i }
}