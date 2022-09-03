package algorithms.projecteuler

fun main() {
    val matched = mutableSetOf<Int>()
    (10000 downTo 1).forEach { a ->
        val b = d(a)
        if(d(a) == b && d(b) == a && a != b) {
            matched += a
            matched += b
        }
    }
    println(matched.sum())
}

fun d(num: Int): Int {
    var count = 0
    for(i in 1 until num) {
        if(num % i == 0) count += i
    }
    return count
}