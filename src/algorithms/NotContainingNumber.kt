package algorithms

//0~9の数の中で入ってない数の和
object NotContainingNumber {
    operator fun invoke(numbers: List<Int>): Int {
        return (0 .. 9).filter { !numbers.contains(it) }.reduce{result, number -> result + number}
    }
}