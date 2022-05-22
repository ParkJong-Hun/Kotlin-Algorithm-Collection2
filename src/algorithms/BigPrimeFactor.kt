package algorithms

//最大の素因数
//素因数：なんかの数を素数の積だけで表現するとき、この素数達。
object BigPrimeFactor {
    operator fun invoke(num: Long): Long {
        var max : Long = 0
        var number : Long = num
        var i : Long = 2

        while(i <= number) {
            if (checkPrime(i) && number % i == 0L) {
                number /= i
                max = i
            } else {
                i += 1
            }
        }

        return max
    }

    private fun checkPrime(num: Long): Boolean {
        if(num == 0L || num == 1L) return false
        for(i in 2 .. num / 2 ) {
            if(num % i == 0L) {
                return false
            }
        }
        return true
    }
}