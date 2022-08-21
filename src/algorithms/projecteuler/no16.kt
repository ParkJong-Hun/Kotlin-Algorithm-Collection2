package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    val a = BigInteger("2").pow(1000)
    print(a.toString().map { it.digitToInt() }.sum())
}