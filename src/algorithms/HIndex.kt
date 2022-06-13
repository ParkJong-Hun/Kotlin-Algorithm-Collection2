package algorithms

import template.Info
import kotlin.math.min

//科学者の生産性、影響力を示す。発表した論文n編をh回以上引用された論文がh編以上で、残り論文がh回以下引用されたらhの最大数がH-Index
object HIndex {
    operator fun invoke(citations: IntArray) =
        citations.sortedDescending().mapIndexed { index, citation ->
            Info("${index + 1}, $citation, ${min(index + 1, citation)}")
            min(index + 1, citation)
        }.maxOrNull()
}