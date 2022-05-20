package algorithms

import template.Info

//フィボナッチ数（Intの計算では４６が限界）
object Fibonacci {
    private lateinit var save: MutableList<Int>
    private var isFirst = true

    operator fun invoke(num: Int): Int {
        if(isFirst) {
            isFirst = false
            save = MutableList(num) { -1 }
            save[0] = 0
            save[1] = 1
        }

        val x = if(save[num - 1] == -1) Fibonacci(num - 1).also { save[num - 1] = it }
        else save[num - 1]

        val y = if(save[num - 2] == -1) Fibonacci(num - 2).also { save[num - 2] = it }
        else save[num - 2]

        return x + y
    }
}