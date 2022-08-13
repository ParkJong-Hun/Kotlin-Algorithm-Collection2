package algorithms.projecteuler

import template.Info
import java.math.BigInteger

fun main() {
    val list = mutableListOf<BigInteger>()
    var i = (1).toBigInteger()
    while(true) {
        if(i.isProbablePrime(10)) {
            list.add(i)
        }
        if(list.size == 10001) {
            Info(list.last())
            break
        }
        i += (1).toBigInteger()
    }
}