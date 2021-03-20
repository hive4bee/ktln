package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try{
            repeat(1000){i->
                println("I'm slepping $i....")
                delay(500L)
            }
        }
//        finally {
//
//            println("Bye!")
//        }
        finally{
            withContext(NonCancellable){
                println("I'm running finally")
                delay(3000L)
                println("Non-Cancellable")
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin()//작업을 취소하고 완료될 때까지 기다림
    println("main Quit")
}
/**
 * 일반적인 finally블록에서 지연 함수를 사용하려고 하면 코루틴이 취소되므로 지연 함수를 사용할 수 없음
 * 만일 finally 블록에 시간이 걸리는 작업이나 지연 함수가 사용될 경우 실행을 보장하기 위해서는
 * NonCancellable 문맥에서 작동되도록 해야한다.
 */