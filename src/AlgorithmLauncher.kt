import algorithms.*
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
    Result(SortedArrayIndexK(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))).toList().toString())
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