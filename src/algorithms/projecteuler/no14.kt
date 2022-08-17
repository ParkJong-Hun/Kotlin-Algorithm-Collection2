package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    var answer:Pair<Int, Long> = 0 to 0L
    for (i in 1 .. 1_000_000) {
        val a = collatz((i).toBigInteger())
        if(answer.second < a) {
            answer = i to a
        }
    }
    println("${answer.first} ${answer.second}")
}

fun collatz(num: BigInteger): Long {
    var a = num
    var count = 0L
    while (a != (1).toBigInteger()) {
        if(a % (2).toBigInteger() == (0).toBigInteger()) {
            a = a / (2).toBigInteger()
        } else {
            a = a * (3).toBigInteger() + (1).toBigInteger()
        }
        count += 1
    }
    return count
}