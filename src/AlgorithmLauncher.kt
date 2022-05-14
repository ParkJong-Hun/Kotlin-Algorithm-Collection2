import algorithms.HelloWorld
import algorithms.SortNumber
import template.WriteReturnTypeWhenYouNeeded

/**
 * IntelliJではこれをRun
 */
fun main() {
    /* 今すぐ問題に回答するためにテストするものはこれを呼び出す。
    "cmd" + "/"でコメントパウとを活性/非活性 */
    println("正解は:${Solution().solution()}")

//    //algorithmsに保存したい問題はこうやって呼び出す。
//    val savedAlgorithm = HelloWorld()
//    println(savedAlgorithm())
}

/**
 * 今すぐ問題に回答するためにテストするものはここに作成
 */
//例問題：1から１００までの整数の合計を求めてください。
class Solution {
    fun solution(): Int {
        var answer = 0
        for(i in 1..100) {
            answer += i
        }
        return answer
    }
}