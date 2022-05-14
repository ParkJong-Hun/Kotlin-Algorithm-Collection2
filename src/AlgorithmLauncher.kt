import algorithms.HelloWorld
import template.WriteReturnTypeWhenYouNeeded

/**
 * IntelliJではこれをRun
 */
fun main() {
    /* 今すぐ問題に回答するためにテストするものはこれを呼び出す。
    "cmd" + "/"でコメントパウとを活性/非活性 */
    println("${Solution().solution()}")

    //algorithmsに保存したい問題はこうやって呼び出す。
    val savedAlgorithm = HelloWorld()
    println(savedAlgorithm())
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