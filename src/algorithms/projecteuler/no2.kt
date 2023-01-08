package algorithms.projecteuler

fun main() {
    val list = mutableListOf(1L, 2L)
    do {
        val temp = list[list.size - 2] + list[list.size - 1]
        if (temp >= 4_000_000L) {
            break
        } else {
            list.add(list[list.size - 2] + list[list.size - 1])
        }
    } while (true)
    println(list.filter { it % 2L == 0L }.sum())
}