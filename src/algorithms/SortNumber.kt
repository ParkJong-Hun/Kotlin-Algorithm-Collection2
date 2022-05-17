package algorithms

object SortNumber {
    operator fun invoke(list: List<Int>, isDescending: Boolean) =
        if(isDescending) list.sorted() else list.sortedDescending()
}