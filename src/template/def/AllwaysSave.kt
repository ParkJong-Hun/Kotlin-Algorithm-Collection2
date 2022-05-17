package template.def

import Solution
import algorithms.HelloWorld
import java.util.logging.Logger

/**
 * コードを使わなくても消えないようにするファイル。
 */
typealias WriteReturnTypeWhenYouNeeded = Unit

object AllwaysSave {
    private val solution = Solution()
    private val helloWorld = HelloWorld

    private fun foo() {
        helloWorld()
    }
}