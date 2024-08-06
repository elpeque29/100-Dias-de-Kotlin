package `100-Dias-de-Kotlin`.`Dia-016`.`15_Asincronia`

import java.time.LocalTime
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeInMillis = measureTimeMillis { async() }
    println("Duration: $timeInMillis")
    val extraInMillis = measureTimeMillis { extra() }
    println("Duration: $extraInMillis")
}

suspend fun async(name :String = "1", duration :Long = 1000) = coroutineScope {
    launch {
        delay(duration)
        println("Function $name ends at: ${LocalTime.now()}")
    }
    println("Function $name starts: ${LocalTime.now()}")
}

suspend fun extra() = coroutineScope {
    launch {
        val aJob = async { a() }
        val bJob = async { b() }
        val cJob = async { c() }
        aJob.await()
        bJob.await()
        cJob.await()
        d()
    }
}

suspend fun a() {
    delay(1000)
    println("Executed function a")
}

suspend fun b() {
    delay(2000)
    println("Executed function b")
}

suspend fun c() {
    delay(3000)
    println("Executed function c")
}

suspend fun d() {
    delay(1000)
    println("Executed function d")
}