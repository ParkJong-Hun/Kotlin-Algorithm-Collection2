package algorithms.programmers

import template.Result

/**
 * 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */

fun main() {
    Result(solution("banana").toList().toString()) // [-1, -1, -1, 2, 2, 2]
    Result(solution("foobar").toList().toString()) // [-1, -1, 1, -1, -1, -1]
}

fun solution(s: String): IntArray {
    return s.mapIndexed { index, c ->
        for (i in index - 1 downTo 0) {
            if (s[i] == c) {
                return@mapIndexed index - i
            }
        }
        return@mapIndexed -1
    }.toIntArray()
}