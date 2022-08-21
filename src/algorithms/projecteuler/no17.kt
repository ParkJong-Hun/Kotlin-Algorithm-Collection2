package algorithms.projecteuler

fun main() {
    val list = hashMapOf(
        1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five", 6 to "six", 7 to "seven", 8 to "eight", 9 to "nine", 10 to "ten",
        11 to "eleven", 12 to "twelve", 13 to "thirteen", 14 to "fourteen", 15 to "fifteen", 16 to "sixteen", 17 to "seventeen", 18 to "eighteen", 19 to "nineteen",
        20 to "twenty", 30 to "thirty", 40 to "forty", 50 to "fifty", 60 to "sixty", 70 to "seventy", 80 to "eighty", 90 to "ninety",
        100 to "hundred",
        1000 to "one thousand"
    )
    var count = 0
    (1 .. 1000).forEach { original ->
        var temp = original
        var str = ""
        if(temp == 1000) {
            str += list[temp]
            temp = 0
        }
        while(temp != 0) {
            when(temp.toString().length) {
                3 -> {
                    str += list[temp / 100] + " " + list[100]
                    if(temp % 100 != 0) str += " and "
                    temp %= 100
                }
                2 -> {
                    if(temp >= 20) {
                        str += list[temp / 10 * 10]
                        if (temp % 10 != 0) str += "-"
                        temp %= 10
                    } else {
                        str += list[temp]
                        temp = 0
                    }
                }
                1 -> {
                    str += list[temp]
                    temp = 0
                }
            }
        }
        println("$original $str ${str.replace("-", "").replace(" ", "").length}")
        count += str.replace("-", "").replace(" ", "").length
    }
    println(count)
}