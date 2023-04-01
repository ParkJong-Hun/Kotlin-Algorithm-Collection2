package algorithms.programmers

import template.Result

/**
 * 추억 점수
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */

fun main() {
    Result(
            a(
                    arrayOf("may", "kein", "kain", "radi"),
                    intArrayOf(5, 10, 1, 3),
                    arrayOf(arrayOf("may", "kein", "kain", "radi"),
                            arrayOf("may", "kein", "brin", "deny"),
                            arrayOf("kon", "kain", "may", "coni")
                    )
            ).toList()
    ) // [19, 15, 6]
}

private fun a(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val pairs = name.mapIndexed { index, s -> s to yearning[index] }
    return photo.map { it.fold(0) { acc, s -> acc + (pairs.find { it.first == s }?.second ?: 0) } }.toIntArray()
}