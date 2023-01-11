package algorithms.programmers

import template.Result

/**
 * 크기가 작은 부분문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=kotlin
 */

fun main() {
    Result(solution("3141592", "271")) // 2
    Result(solution("500220839878", "7")) // 8
    Result(solution("10203", "15")) // 3
}

fun solution(t: String, p: String): Int {
    var answer: Int = 0
    val size = p.length
    for (i in 0..t.length - size) {
        val temp = t.substring(i until i + size)
        if (temp.toBigInteger() <= p.toBigInteger()) answer++
    }
    return answer
}