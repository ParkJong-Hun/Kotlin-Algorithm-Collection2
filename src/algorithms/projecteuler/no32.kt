package algorithms.projecteuler

fun main() {
    val set = mutableSetOf<Pair<Long, Long>>()
    for (i in 0L..10000L) {
        for (j in 0L..10000L) {
            val iS = i.toString()
            val jS = j.toString()
            val temp = (i * j).toString()
            val d = iS + jS + temp
            if (d.length == 9) {
                if (d.contains("1") &&
                    d.contains("2") &&
                    d.contains("3") &&
                    d.contains("4") &&
                    d.contains("5") &&
                    d.contains("6") &&
                    d.contains("7") &&
                    d.contains("8") &&
                    d.contains("9")
                ) {
                    set.add(i to j)
                    println((i to j).toString() + temp)
                }
            }
        }
    }
    val result = mutableSetOf<Long>()
    set.map { result.add(it.first * it.second) }
    println(result.sum())
}