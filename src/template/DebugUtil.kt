package template

//結果ロギングに使う
object Result {
    operator fun invoke(answer: Any) {
        println("\u001B[40m \u001B[33m 結果: \u001B[32m$answer")
    }
}

//情報確認用
object Info {
    operator fun invoke(message: Any) {
        println("\u001B[40m\u001B[34m  情報: \u001B[37m$message")
    }
}