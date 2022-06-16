package algorithms

//stringで0を数えて、残った１の数をstringにする。stringが1になるまで繰り返すと、繰り返した回数となくなった0の数は？
object RepeatConvertingToBinary {
    operator fun invoke(s: String): IntArray {
        var string = s
        var removedZero = 0
        var count = 0

        while (string != "1") {
            removedZero += string.replace("1", "").count()
            string = Integer.toBinaryString(string.replace("0", "").count())
            count++
        }
        return intArrayOf(count, removedZero)
    }
}