package algorithms

//文字列の中で一番小さい数と大きい数
object MaxMin {
    operator fun invoke(s: String): String = s.split(" ").map { it.toInt() }.let { "${it.minOrNull()} ${it.maxOrNull()}" }
}