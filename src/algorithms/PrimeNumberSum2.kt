package algorithms

//素数の和
object PrimeNumberSum2 {
    operator fun invoke(min: Int = 1, max: Int): Int {
        var result = 0
        val isPrime = MutableList(max + 1){ false }
        for(i in min .. max) {
            if(isPrime[i]) {
                continue
            } else if(checkPrime(i)) {
                isPrime[i] = true
            }
        }
        isPrime.forEachIndexed { index, value ->
            if(value) result += index
        }
        return result
    }

    private fun checkPrime(num: Int): Boolean {
        if(num == 0 || num == 1) return false
        for(i in 2 .. num / 2 ) {
            if(num % i == 0) {
                return false
            }
        }
        return true
    }
}