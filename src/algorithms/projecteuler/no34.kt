package algorithms.projecteuler

fun main() {
    var result = 0
    for (i in 3..362280) {
        val temp = i.toString()
        var tempResult = 0
        temp.forEach {
            tempResult += factorial(it.digitToInt())
        }
        if (tempResult == i) result += i
    }
    println(result)
}