package algorithms.programmers

import template.Result

/**
 * 콜라 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */

fun main() {
    Result(solution(2, 1, 20)) // 19
    Result(solution(3, 1, 20)) // 9
}

private fun solution(a: Int, b: Int, n: Int): Int {
    var answer = 0
    var mine = n
    while (mine % a != mine || mine % a == 0) {
        val received = (mine / a) * b
        answer += received
        mine = mine - ((mine / a) * a) + received
    }
    return answer
}