package algorithms

import template.Info

//同じ種類の服を１着以上着る選択肢があったら、着るパータンは何個あるか？
object Clothes {
    operator fun invoke(clothes: Array<Array<String>>) = clothes.groupBy { it[1] }.values.fold(1) { acc, value ->
        Info("$acc , ${value.map { it.toList() }.toList()}")
        acc * (value.size + 1)
    } - 1
}
//場合の計算=(a + 1) * (b + 1) * (c + 1) ... (z + 1) - 1
//fold: 初期値がある。 reduce: ない
