package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun doWork1():String{
    delay(1000)
    return "Work1"
}

suspend fun doWork2():String{
    delay(3000)
    return "Work2"
}

private fun worksInSerial(){
    //순차적 실행
    GlobalScope.launch{
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One: $one")
        println("Kotlin Two: $two")
    }
}

/**
 * launch에 정의된 doWork1()과 doWork2()함수는 순차적으로 표현할 수 있다. 이 2개의 함수는
 * 내부적으로 비동기 코드로서 동시에 작동할 수 있지만 코드만 봤을 때는 순차적으로 실행되는 것처럼
 * 표현함으로서 프로그래밍의 복잡도를 낮추게 됨
 */

fun main(){
//    worksInSerial()
    worksInParallel()
    readLine()//main()이 먼저 종료되는 것을 방지하기 위해 콘솔에서 (Enter)키 입력 대기
}
private fun worksInParallel(){
    //Deferred<T>를 통해 결과값을 반환
    val one=GlobalScope.async{
        doWork1()
    }
    val two = GlobalScope.async{
        doWork2()
    }
    GlobalScope.launch{
        val combined = one.await()+"_"+two.await()
        println("Kotlin Combined: $combined")
    }
}
/**
 * doWork1()과 doWork2()는 async에 의해 감싸져 있으므로 완전히 병행 수행할 수 있다.
 * 여기서는 delay()로 1초만 지연시킨 doWork1()이 먼저 종료되리라 예측할 수 있다. 그러나 좀 더 복잡한
 * 루틴을 작성하는 경우에는 테스크들과 같이 병행 수행되므로 어떤 루틴이 먼저 종료될지 알기 어렵다.
 * 따라서 테스크가 종료되는 시점을 기다렸다가 결과를 받을 수 있도록 await()를 사용해 현재 스레드의 블로킹
 * 없이 먼저 종료되면 결과를 가져올 수 있다. 여기서는 combined라는 변수에 2개의 비동기 루틴이 종료되고
 * 결과가 반환되면 물자를 합쳐서 할당한다.
 */