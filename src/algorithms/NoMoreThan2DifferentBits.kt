package algorithms

//numberとビットが１〜２個違って大きい数
object NoMoreThan2DifferentBits {
    operator fun invoke(numbers: LongArray): LongArray =
        numbers.map {
            number -> (number.inv() and number + 1).let {
                number or it and (it shr 1).inv()
            }
        }.toLongArray()
}