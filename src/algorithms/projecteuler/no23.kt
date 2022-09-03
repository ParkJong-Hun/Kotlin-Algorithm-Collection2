package algorithms.projecteuler

fun main() {
    val list = mutableSetOf<Int>()
    (1 until 28123).forEach {
        var temp = 0
        (1 until it).forEach { a ->
            if(it % a == 0) temp += a
        }
        if(it < temp) {
            list += it
        }
    }
    val plus = mutableSetOf<Int>()
    list.forEach { x ->
        list.forEach { y ->
            plus += x + y
        }
    }
    val tot = mutableSetOf<Int>()
    (1 until 28123).forEach {
        if(!plus.contains(it)) tot += it
    }
    println(tot.sum())
}