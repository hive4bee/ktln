package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch(start=CoroutineStart.LAZY) {
        var nextPrintTime = startTime
        var i = 0
        while(i < 5){
            if(System.currentTimeMillis() >= nextPrintTime){
                println("I'm sleeping ${i++}...")
                nextPrintTime +=500L
            }
        }
    }
    delay(1300L)
    println(">..")
    println("main: I'm tired of wating!")
    job.start()
    delay(1000L)
    println("main: Now I can quit")
}
/**
 * 만일 코드를 중단하기 위해 코루틴에 조건식을 넣으려고 할 때 연산이 마무리되기 전까지는
 * 조건식에 의해 루틴이 종단도ㅓㅣ지 않는다는 것을 기억해야 한다.
 */