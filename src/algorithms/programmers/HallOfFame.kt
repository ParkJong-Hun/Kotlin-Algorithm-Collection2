package algorithms.programmers

import template.Result

/**
 * 명예의 전당
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

fun main() {
    Result(solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).toList())
    // [10, 10, 10, 20, 20, 100, 100]
    Result(solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)).toList())
    // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
}

private fun solution(k: Int, score: IntArray): IntArray {
    val temp = mutableListOf<Int>()
    val answer = mutableListOf<Int>()
    score.forEach {
        temp.add(it).also { temp.sortDescending() }
        answer += if (temp.size < k) temp.last() else temp[k - 1]
    }
    return answer.toIntArray()
}