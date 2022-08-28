package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    println((1 .. 100).fold(BigInteger.ONE) { acc, i -> acc * i.toBigInteger() }.toString().map { it.digitToInt() }.sum())
}