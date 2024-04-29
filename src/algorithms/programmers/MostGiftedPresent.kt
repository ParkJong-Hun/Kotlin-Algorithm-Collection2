package algorithms.programmers

import template.Info
import template.Result

/**
 * 가장 많이 받은 선물
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */

fun main() {
    Result(
        solution(
            arrayOf("muzi", "ryan", "frodo", "neo"),
            arrayOf(
                "muzi frodo",
                "muzi frodo",
                "ryan muzi",
                "ryan muzi",
                "ryan muzi",
                "frodo muzi",
                "frodo ryan",
                "neo muzi"
            )
        )
    ) // 2

    Result(
        solution(
            arrayOf("joy", "brad", "alessandro", "conan", "david"),
            arrayOf(
                "alessandro brad",
                "alessandro joy",
                "alessandro conan",
                "david alessandro",
                "alessandro david"
            )
        )
    ) // 4

    Result(
        solution(
            arrayOf("a", "b", "c"),
            arrayOf(
                "a b", "b a", "c a", "a c", "a c", "c a"
            )
        )
    ) // 0
}

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    val giftInfo = mutableMapOf<String, MutableMap<String, Int>>()
    val giftRate = mutableMapOf<String, Pair<Int, Int>>()
    val nextMonthGifts = mutableSetOf<Pair<String, String>>()
    friends.forEach { friend ->
        giftInfo[friend] = mutableMapOf()
        friends.forEach { giftInfo[friend]!![it] = 0 }
        giftRate[friend] = 0 to 0
    }
    gifts.forEach {
        val (from, to) = it.split(" ")
        giftInfo[from]!![to] = giftInfo[from]!!.getOrDefault(to, 0) + 1
        giftRate[from] = giftRate[from]!!.first + 1 to giftRate[from]!!.second
        giftRate[to] = giftRate[to]!!.first to giftRate[to]!!.second + 1
    }
    giftInfo.forEach { (from, map) ->
        map.forEach { (to, fromCount) ->
            val toCount = giftInfo[to]!!.getOrDefault(from, 0)
            when {
                fromCount > toCount
                -> {
                    nextMonthGifts.add(to to from)
                }

                fromCount < toCount
                -> {
                    nextMonthGifts.add(from to to)
                }

                else -> {
                    val fromRate = giftRate[from]!!.first - giftRate[from]!!.second
                    val toRate = giftRate[to]!!.first - giftRate[to]!!.second
                    if (fromRate > toRate) {
                        nextMonthGifts.add(to to from)
                    } else if (fromRate < toRate) {
                        nextMonthGifts.add(from to to)
                    }
                }
            }
        }
    }

    Info(nextMonthGifts)

    return nextMonthGifts.groupBy { it.second }.mapValues { it.value.size }
        .maxByOrNull { it.value }?.value ?: 0
}