package algorithms

//「パク」と言うのをn字になるように繰り返したら？たてば3の場合正解はパクパ
object Pakupakupa {
    operator fun invoke(n: Int): String = String(CharArray(n) { i -> if (i % 2 == 0) 'パ' else 'ク' })
}