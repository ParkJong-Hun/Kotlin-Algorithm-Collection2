package algorithms.programmers

import template.Result

/**
 * 삼총사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */
fun main() {
    Result(solution(intArrayOf(-2, 3, 0, 2, -5))) // 2
    Result(solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3))) // 5
    Result(solution(intArrayOf(-1, 1, -1, 1))) // 0
}

private fun solution(number: IntArray): Int {
    var answer = 0
    for (i in number.indices) {
        for (j in i + 1 until number.size) {
            for (k in j + 1 until number.size) {
                if (number[i] + number[j] + number[k] == 0) answer++
            }
        }
    }
    return answer
}