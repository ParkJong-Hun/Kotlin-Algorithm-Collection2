import algorithms.HelloWorld
import algorithms.SortNumber
import template.WriteReturnTypeWhenYouNeeded

/**
 * IntelliJではこれをRun
 */
fun main() {
//    /* 今すぐ問題に回答するためにテストするものはこれを呼び出す。
//    "cmd" + "/"でコメントパウとを活性/非活性 */
//    println("${Solution().solution()}")

    //algorithmsに保存したい問題はこうやって呼び出す。
    val savedAlgorithm = SortNumber()
    val tests = listOf(listOf(3, 2, 1, 5, 4), listOf(4, 3, 5, 2 ,1), listOf(1, 2, 3, 4, 5), listOf(5, 4, 3, 2, 1))
    tests.forEach{ testCase ->
        println(savedAlgorithm(testCase))
    }
    tests.forEach{ testCase ->
        println(savedAlgorithm(testCase, isAscending = false))
    }
}

/**
 * 今すぐ問題に回答するためにテストするものはここに作成
 */
class Solution {
    fun solution(): WriteReturnTypeWhenYouNeeded {
        //FIXME: コードを作成
        return //何かを返す。
    }
}