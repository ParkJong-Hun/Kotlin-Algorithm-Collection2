package algorithms.projecteuler

import java.math.BigInteger


fun main() {
    var num = BigInteger.ONE
    val set = mutableSetOf<Pair<BigInteger, BigInteger>>(BigInteger.ZERO to BigInteger.ZERO)

    fun fibo(n: BigInteger): BigInteger {
        return when(n) {
            BigInteger.ONE, BigInteger.TWO -> BigInteger.ONE
            else -> {
                val a = if(set.any { it.first == n - BigInteger.ONE }) set.first{ it.first == n - BigInteger.ONE }.second else fibo(n - BigInteger.ONE)
                val b = if(set.any { it.first == n - BigInteger.TWO }) set.first { it.first == n - BigInteger.TWO }.second else fibo(n - BigInteger.TWO)
                a + b
            }
        }
    }

    while(true) {
        set += num to fibo(num)
        if(set.any { it.second.toString().length >= 1000 }) {
            break
        }
        num += BigInteger.ONE
    }
    println(set.first { it.second.toString().length >= 1000 })
}
