package algorithms.projecteuler

fun main() {
    val set = mutableSetOf<Int>()
    for (i in 1 until 1000) {
        if (i % 3 == 0 || i % 5 == 0) {
            set.add(i)
        }
    }
    println(set.sum())
}