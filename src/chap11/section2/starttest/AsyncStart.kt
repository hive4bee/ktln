package chap11.section2

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doWork11(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork22(): String {
    delay(3000)
    return "Work2"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork11() }
        val two = async(start = CoroutineStart.LAZY) { doWork22() }
        println("AWAIT: ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")
}