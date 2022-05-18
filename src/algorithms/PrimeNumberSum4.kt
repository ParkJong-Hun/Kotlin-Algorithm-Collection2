package algorithms

import kotlin.math.sqrt

//素数の和
object PrimeNumberSum4 {
    operator fun invoke(min: Int = 1, max: Int): Int {
        var result = 0
        val isPrime = MutableList(max + 1){true}
        isPrime[0] = false
        isPrime[1] = false

        for(i in min..sqrt(max.toDouble()).toInt()) {
            if (i < 2 || !isPrime[i]) continue
            for (j in 2 * i..max step i) isPrime[j] = false
        }

        isPrime.mapIndexed { index, value ->
            if(value) result += index
        }

        return result
    }
}