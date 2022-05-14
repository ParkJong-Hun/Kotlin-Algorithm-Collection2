package algorithms

class SortNumber {
    operator fun invoke(testInput: List<Int>, isAscending: Boolean = true): List<Int> {
        return when(isAscending) {
            true -> testInput.sorted()
            else -> testInput.sortedDescending()
        }
    }
}