package algorithms.programmers

import template.Result

/**
 * 푸드 파이터 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240?language=kotlin
 */

fun main() {
    Result(solution(intArrayOf(1,3,4,6))) // "1223330333221"
    Result(solution(intArrayOf(1,7,1,2))) // "111303111"
}
private fun solution(food: IntArray): String {
    var answer = ""
    food.drop(0).forEachIndexed { i, f ->
        if(f >= 2) {
            var temp = ""
            repeat((f - (f % 2)) / 2) {
                temp += i
            }
            answer += temp
        }
    }
    answer = answer + "0" + answer.reversed()
    return answer
}