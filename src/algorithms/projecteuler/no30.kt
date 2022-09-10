package algorithms.projecteuler

fun main() {
    var tot = 0L
    (2 .. (9).toBigInteger().pow(5).toLong() * 5L).forEach {
        if(it == it.toString().map { c -> c.digitToInt().toBigInteger().pow(5) }.sumOf { num -> num.toLong() })
            tot += it
    }
    println(tot)
}