package algorithms.projecteuler

import java.math.BigInteger

fun main() {
    var a = (1).toBigInteger()
    var count = (2).toBigInteger()
    while(true) {
        val list = mutableListOf<BigInteger>()
        for(i in 1 .. a.sqrt().toLong()) {
            if(a % i.toBigInteger() == (0).toBigInteger()) {
                list.add(i.toBigInteger())
            }
        }
        val newList : MutableSet<BigInteger> = HashSet(list)
        for(j in list) {
            newList.add(a / j)
        }
        if(newList.size >= 500) {
            println(a)
            return
        }
        a += count
        count += (1).toBigInteger()
    }
}