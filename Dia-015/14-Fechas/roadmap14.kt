package `100-Dias-de-Kotlin`.Dia_014.`13_Fechas`

// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    val date = LocalDateTime.now()
    val bornDate = LocalDateTime.of(2004, 6, 29, 13, 30)
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val result = bornDate.until(date, ChronoUnit.YEARS)
    val formatedDate = date.format(formatter)
    val formatedBornDate = bornDate.format(formatter)
    println("Today is $formatedDate, I was born in $formatedBornDate. Since then $result years have passed")
    println("\nEXTRA\n")
    extra()
}

private fun extra() {
    val bornDate = LocalDateTime.of(2004, 6, 29, 13, 30)

    fun formatter(pattern: String): java.time.format.DateTimeFormatter {
        val formatter = DateTimeFormatter.ofPattern(pattern)
        return formatter
    }

    val patternDMY = "dd-MM-yyyy"
    val patternYMD = "yyyy-MM-dd"
    val patternMDY = "MM-dd-yyyy"
    val patternMonthWritten = "d MMM yyyy"
    val patternHM = "HH:mm"
    val patternHMS = "HH:mm:ss"

    val pattern = mapOf(
        "hourMinuteSecond" to bornDate.format(formatter(patternHMS)),
        "dayOfTheYear" to bornDate.dayOfYear,
        "dayOfTheWeek" to bornDate.dayOfWeek,
        "dayOfTheMonth" to bornDate.dayOfMonth,
        "nameOfMonth" to bornDate.month,
        "dayMonthYear" to bornDate.format(formatter(patternDMY)),
        "yearMonthDay" to bornDate.format(formatter(patternYMD)),
        "monthDayYear" to bornDate.format(formatter(patternMDY)),
        "monthWritten" to bornDate.format(formatter(patternMonthWritten)),
        "hourMinute" to bornDate.format(formatter(patternHM)),
    )

    for (x in pattern) {
        println("Format ${x.key} = ${x.value}")
    }
}