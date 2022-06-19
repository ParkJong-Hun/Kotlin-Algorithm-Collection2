package algorithms

//数字と単語が混ざってる文字列で、単語を全部数字に変換するとどんな数になるか？
object NumStringAndWord {
    operator fun invoke(string: String): Int {
        var answer = string
        val dictionary = mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9"
        )
        for ((key, value) in dictionary) {
            answer = answer.replace(key, value)
        }
        return answer.toInt()
    }
}