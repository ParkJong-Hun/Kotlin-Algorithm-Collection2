package algorithms.programmers

import template.Result

/**
 * 기사단원의 무기
 * https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */

// FIXME 시간복잡도 O(n)으로 만들기

fun main() {
    Result(solution(5, 3, 2)) // 10
    Result(solution(10, 3, 2)) // 21
    Result(solution(100000, 3, 2))
}

private fun solution(number: Int, limit: Int, power: Int): Int {
    val knightage = mutableMapOf<Int, Int>()
    return (1..number).sumOf { knight ->
        knightage[knight]?.let { return@sumOf it }
        knightage[knight] = (1..knight).fold(0) { init, acc -> init + if (knight % acc == 0) 1 else 0 }.takeIf { it <= limit } ?: power
        knightage[knight]!!
    }
}