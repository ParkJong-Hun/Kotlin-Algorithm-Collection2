package algorithms.projecteuler

import java.math.BigInteger

val dynamic = mutableListOf(mutableListOf<BigInteger>())

fun main() {
    (0 until 20).forEach { a ->
        (0 until 20).forEach { b ->
            dynamic.last().add(BigInteger("0"))
        }
        dynamic.add(mutableListOf())
    }
    dynamic.removeLast()
    println(greedy(20, 20))
}

fun greedy(x: Int, y: Int): BigInteger {
    return if(dynamic[x - 1][y - 1] != BigInteger("0")) dynamic[x - 1][y - 1]
    else if (x == 1) y.toBigInteger() + (1).toBigInteger()
    else if (y == 1) x.toBigInteger() + (1).toBigInteger()
    else {
        dynamic[x - 1][y - 1] = greedy(x, y - 1) + greedy(x - 1, y)
        dynamic[x - 1][y - 1]
    }
}

//고등학교 때 조합식으로는 더 간단하게
//N! / R! * (N - R)-!
