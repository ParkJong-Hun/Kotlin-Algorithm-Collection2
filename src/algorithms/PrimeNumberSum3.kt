package algorithms

//素数の和
object PrimeNumberSum3 {
    operator fun invoke(min: Int = 1, max: Int): Int {
        var result = 0
        val isPrime = MutableList(max + 1){true}
        isPrime[0] = false
        isPrime[1] = false

        for(i in min..max) {
            if (i == 1) continue
            if (isPrime[i])
                for (j in 2 * i..max step i) isPrime[j] = false
        }

        isPrime.mapIndexed { index, value ->
            if(value) result += index
        }

        return result
    }
}