import algorithms.HelloWorld
import algorithms.PrimeNumberSum
import algorithms.PrimeNumberSum2
import algorithms.PrimeNumberSum3
import template.Result
import template.def.WriteReturnTypeWhenYouNeeded

/**
 * IntelliJではこれをRun
 */
fun main() {
//    /* 今すぐ問題に回答するためにテストするものはこれを呼び出す。
//    「cmd」 + 「/」でコメントパウとを活性/非活性 */
//    Result("${Solution().solution()}")

    //algorithmsに保存したい問題はこうやって呼び出す。
    Result(PrimeNumberSum3(1, 10))
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