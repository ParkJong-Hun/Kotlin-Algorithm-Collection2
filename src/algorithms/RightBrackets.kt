package algorithms

//括弧がある文字列を文字の数くらい回したら正しい模様の括弧が何個出るか？
object RightBrackets {
    operator fun invoke(string: String): Int {
        var answer = 0

        for(index in string.indices) {
            val temp = string.substring(index) + string.substring(0,index)
            if(isRight(temp)) answer += 1
        }
        return answer
    }

    private fun isRight(string: String): Boolean {
        val list = mutableListOf<Char>()
        val endChar = charArrayOf(']',')','}')

        for(char in string) {
            if(endChar.contains(char)) {
                if(list.isEmpty()) {
                    return false
                }
                val temp = list.removeAt(list.size - 1)
                when(char) {
                    ']' -> if(temp!='[') return false
                    ')' -> if(temp!='(') return false
                    '}' -> if(temp!='{') return false
                }
            } else {
                list.add(char)
            }
        }
        return list.size==0
    }
}