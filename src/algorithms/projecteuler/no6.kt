package algorithms.projecteuler

import template.Info

fun main() {
    var a = (0).toBigInteger()
    var b = (0).toBigInteger()
    (1..100).forEach{
        a += it.toBigInteger().pow(2)
        b += it.toBigInteger()
    }
    b = b.pow(2)
    Info("$a, $b")
    Info(b - a)
}