package algorithms

import template.Info

//因数を三進数に変えて数を逆に並べたあと十進数にする
object TernaryReverse {
    operator fun invoke(num: Int): Int {
        val ternary = num.toString(3)
        Info(ternary)
        return ternary.reversed().toInt(3)
        //= num.toString(3).reversed().toInt(3)
    }
}