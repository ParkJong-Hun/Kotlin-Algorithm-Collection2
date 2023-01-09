package algorithms.projecteuler

fun main() {
    val set = mutableSetOf<Int>()
    (100..999).forEach { i ->
        (100..999).forEach { j ->
            val temp = (i * j).toString()
            if (temp == temp.reversed()) set.add(temp.toInt())
        }
    }
    println(set.max())
}