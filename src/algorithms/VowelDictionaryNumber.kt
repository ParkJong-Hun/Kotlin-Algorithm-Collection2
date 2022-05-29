package algorithms

//因数の1~5サイズのｗordは母音辞典で何番目か
object VowelDictionaryNumber {
    private val vowels = listOf('A', 'E', 'I', 'O', 'U')
    private val result = mutableListOf<String>()

    operator fun invoke(word: String): Int {
        dfs("")
        result.mapIndexed { index, string ->
            if(string == word) return index
        }
        return -1 //おかしかったら返す
    }

    private fun dfs(temp: String) {
        if(temp.length > 5) return
        result.add(temp)
        vowels.map { dfs(temp + it) }
    }
}
