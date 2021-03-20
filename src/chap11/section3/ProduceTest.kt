package chap11.section3

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

/**
 * produce는 채널이 붙어 있는 코루틴으로 생산자 측면의 코드를 쉽게 구성할 수 있다.
 * 채널에 값을 보내면 생산자로 볼 수 있고 소비자는 consumeEach함수를 확장해 for문을 대신해서
 * 저장된 요소를 소비한다.
 */
//생산자를 위한 함수 생
fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {
    var total:Int = 0
    for(x in 1..5){
        total +=x
        send(total)
    }
}

fun main() = runBlocking {
    val result = producer()//값의 생산
    result.consumeEach { println("$it") }//소비자 루틴 구성
}
/**
 * 위의 프로그램에서 produce<E>는 값을 생산하고 ReceiveChannel<E>를 반환한다.
 * 그런 다음 result에서 ReceiveChannel의 확장 함수인 consumeEach를 사용하여 각 요소를 처리한다.
 */