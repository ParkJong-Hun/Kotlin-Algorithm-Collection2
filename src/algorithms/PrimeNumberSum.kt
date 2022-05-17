package algorithms

import template.Info

//素数の和
object PrimeNumberSum {
    operator fun invoke(min : Int = 1, max : Int): Int {
        var result = 0
        for (a in min .. max) {
            if(a == 1) continue
            for(i in 2..a) {
                if(i == a) {
                    result += a
                }
                if(a % i == 0) break
            }
        }
        return result
    }
}