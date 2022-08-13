package algorithms.projecteuler

import template.Info
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    for(a in 1 until 1000) {
        for(b in a + 1 until 1000) {
            val c2 = a.toBigInteger().pow(2) + b.toBigInteger().pow(2)
            val c = sqrt(c2.toDouble())
            if(c - c.toInt().toDouble() == 0.0) {
                if(b < c) {
                    if(a + b + c.toInt() == 1000) {
                        val d = a * b * c
                        Info(a.toBigInteger() * b.toBigInteger() * c.toInt().toBigInteger())
                    }
                }
            }
        }
    }
}