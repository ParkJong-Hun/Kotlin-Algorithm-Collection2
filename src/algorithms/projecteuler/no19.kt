package algorithms.projecteuler

import java.time.DayOfWeek
import java.time.LocalDate

fun main() {
    var date = LocalDate.of(1901, 1, 1)
    var count = 0
    while(date.year != 2001) {
        date = date.plusDays(1)
        if(date.dayOfWeek == DayOfWeek.SUNDAY && date.dayOfMonth == 1) count += 1
    }
    println(count)
}