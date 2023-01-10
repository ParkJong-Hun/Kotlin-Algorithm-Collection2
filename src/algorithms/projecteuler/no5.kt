package algorithms.projecteuler

fun main() {
    var answer = 0L
    while (true) {
        answer++
        for (i in 1..20) {
            if (answer % i != 0L) break
            else if (i == 20) {
                println(answer)
                return
            }
        }
    }
}