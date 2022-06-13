package algorithms

//配列で作れる一番大きい数
object BigNumber {
    operator fun invoke(numbers: IntArray): String {
        var answer = ""
        numbers.sortedWith { num1: Int, num2: Int -> "$num2$num1".compareTo("$num1$num2") }.forEach { answer += it }
        if ("(0*)".toRegex().replace(answer, "").isEmpty()) {
            answer = "0"
        }
        return answer
    }
}