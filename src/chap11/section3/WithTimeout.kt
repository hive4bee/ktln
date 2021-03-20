package chap11.section3

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {
    try{
        withTimeout(1300L){
            repeat(1000){i->
                println("I'm a sleeping $i...")
                delay(500L)
            }
        }
    }catch(e:TimeoutCancellationException){
        println("timed out with $e")
    }
}