package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    var result = BigInteger.ZERO
    for (i in 1..1_000_000) {
        val string = i.toString()
        if (string == string.reversed()) {
            val binary = Integer.toBinaryString(i)
            if (binary == binary.reversed()) {
                result += i.toBigInteger()
            }
        }
    }
    println(result)
}