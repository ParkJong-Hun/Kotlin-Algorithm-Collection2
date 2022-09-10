package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    val set = mutableSetOf<BigInteger>()
    (2 .. 100).forEach { a ->
        (2 .. 100).forEach { b ->
            set += a.toBigInteger().pow(b)
        }
    }
    println(set.size)
}