package algorithms

import template.Info

//もらった数の配列をつかって作れる数で素数は何個？
object PrimeNumberCombination {
    lateinit var combinationNumbers: MutableSet<Int>

    operator fun invoke(numbers: String): Int {
        var answer = 0
        combinationNumbers = mutableSetOf()

        permutation(numbers,"", 0)

        combinationNumbers.distinct().forEach { number ->
            if(isPrime(number)) answer++
        }

        return answer
    }
    //照合を作る
    private fun permutation(numbers: String, result: String, wave: Int) {
        if(!result.isNullOrEmpty()) combinationNumbers.add(result.toInt())
        Info("comb: $combinationNumbers")
        if(numbers.isEmpty()) return
        numbers.forEachIndexed { index, c ->
            Info("[wave:$wave] index: $index, c: $c")
            permutation((numbers.removeRange(index..index)),result + c, wave + 1)
        }
    }

    private fun isPrime(num:Int): Boolean {
        if(num == 1 || num == 0) return false
        for(i in 2..num / 2) {
            if(num % i == 0) return false
        }
        return true
    }
}