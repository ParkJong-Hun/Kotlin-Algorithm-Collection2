package algorithms

import template.Info
import kotlin.math.pow

//最大の回文積
//回文数：左から読んでも、右から読んでも同じようになる数（例え：9009）
object BigPalindrome {
    operator fun invoke(xAndYSize: Int): Int {
        var answer = 0
        val maxNum = 10.0.pow(xAndYSize.toDouble()).toInt() - 1
        for(x in maxNum downTo 1 ) {
            for (y in maxNum downTo 1) {
                val product = x * y
                val reverse = "$product".reversed()
                if("$product" == reverse && product > answer) {
                    answer = product
                    Info(answer)
                }
            }
        }
        return answer
    }
}