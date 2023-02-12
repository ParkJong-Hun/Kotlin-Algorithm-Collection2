package algorithms.programmers

import template.Result

/**
 * 둘만의 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */

fun main() {
    Result(solution(s = "aukks", skip = "wbqd", index = 5)) // "happy"
}

private fun solution(s: String, skip: String, index: Int) = s.map { var i = 0; var temp = it; while (i != index) { temp = if (temp != 'z') temp + 1 else 'a'; if (!skip.contains(temp)) i++; }; temp }.joinToString("")