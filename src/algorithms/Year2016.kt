package algorithms

//2016年の何月何日は何曜日か？
object Year2016 {
    operator fun invoke(month: Int, day: Int): String {
        val days = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val lastDays = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        val result = (0 until month - 1).sumOf { lastDays[it] } + day

        return days[result % 7]
    }
}