package template

import Solution
import algorithms.HelloWorld

/**
 * コードを使わなくても消えないようにするファイル。
 */
typealias WriteReturnTypeWhenYouNeeded = Unit

object AllwaysSave {
    private val solution = Solution()
    private val helloWorld = HelloWorld()

    private fun foo() {
        solution.solution()
        helloWorld()
    }
}