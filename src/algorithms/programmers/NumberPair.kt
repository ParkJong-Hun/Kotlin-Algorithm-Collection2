package algorithms.programmers

import template.Result
import kotlin.math.min

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
    return buildString {
        val x = X.groupBy { it }.map { groupX -> groupX.key to groupX.value.size }.toMap()
        val y = Y.groupBy { it }.map { groupY -> groupY.key to groupY.value.size }.toMap()
        x.keys.intersect(y.keys)
            .associateWith { min(x[it]!!, y[it]!!) }
            .toSortedMap(Comparator.reverseOrder())
            .map { (key, value) ->
                repeat(value) {
                    append(key)
                }
            }
    }.let { pair ->
        when {
            pair == "" -> "-1"
            pair.first() == '0' -> "0"
            else -> pair
        }
    }
}