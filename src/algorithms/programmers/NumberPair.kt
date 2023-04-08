package algorithms.programmers

import template.Result

/**
 * 숫자 짝꿍
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 * FIXME O(n2) -> O(n)
 */

fun main() {
    Result(solution("100", "2345")) // -1
    Result(solution("100", "203045")) // 0
    Result(solution("100", "123450")) // 10
    Result(solution("12321", "42531")) // 321
    Result(solution("5525", "1255")) // 552
}

private fun solution(X: String, Y: String): String {
    val y = Y.toMutableList().sortedDescending().toMutableList()
    val x = X.toMutableList().sortedDescending()
    var common = ""
    x.forEach { xc ->
        if (y.remove(xc)) common += xc
    }

    return when {
        common.isEmpty() -> "-1"
        common.first() == '0' -> "0"
        else -> common
    }
}