package algorithms.projecteuler

fun main() {
    val pair = mutableListOf<Pair<Int, Int>>()
    for (i in 10..99) {
        for (j in 10..99) {
            for (k in 1..9) {
                if ("$i".contains("$k") && "$j".contains("$k")) {
                    val child = "$i".replace("$k", "")
                    val parent = "$j".replace("$k", "")
                    if (child.isNotEmpty() && parent.isNotEmpty()) {
                        if (i.toDouble() / j.toDouble() == child.toDouble() / parent.toDouble() && (i.toDouble() / j.toDouble()) < (1).toDouble()) {
                            pair.add(i to j)
                        }
                    }
                }
            }
        }
    }
    val realPair = pair.reduce { acc, p -> acc.first * p.first to acc.second * p.second }
    println(realPair.second.toDouble() / gcd(realPair.first, realPair.second).toDouble())
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a