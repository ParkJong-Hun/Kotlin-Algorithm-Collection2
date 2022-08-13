package algorithms.projecteuler

import template.Info
import java.math.BigInteger
import kotlin.math.sqrt

fun main() {
    var sum = (0).toBigInteger()
    (2..2000000).forEach{
        if(ip(it)) {
            sum += (it).toBigInteger()
        }
    }
    println(sum)
}

fun ip(num: Int): Boolean {
    for(a in 2 .. sqrt(num.toDouble()).toInt()) {
        if (num % a == 0) return false
    }
    return true
}