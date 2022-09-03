package algorithms.projecteuler

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    val list = Files.readString(Path.of("names.txt")).replace("\"", "").split(",").sorted()
    println(list.mapIndexed { index, s -> s.map { c -> c.code - 64 }.sum() * (index + 1) }.sum())
}