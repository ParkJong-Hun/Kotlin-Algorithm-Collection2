package algorithms

//IntArrayをi(command[0])番目からj(command[1])番目まで切ってソートしてでた結果のk(command[2])番目の値をIntArrayに追加してそのIntArrayを返す
object SortedArrayIndexK {
    operator fun invoke(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }
            .toIntArray()
    }
}