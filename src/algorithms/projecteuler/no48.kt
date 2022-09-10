package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    var tot = BigInteger.ZERO
    (1 .. 1000).forEach {
        tot += it.toBigInteger().pow(it)
    }
    println(tot.toString().substring(tot.toString().length - 10 until tot.toString().length))
}