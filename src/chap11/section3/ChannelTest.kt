package chap11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    val channel = Channel<Int>()
    launch {
        for(x in 1..5) channel.send(x*x)//여기세 다량의 CPU 연산 작업이나 비동기 로직을 둘 수 있음
        channel.close()//모두 보내고 닫기 명시
    }
//    repeat(5){println(channel.receive())}//5개의 값을 채널로부터 받음
    for(element in channel) println(element)
    println("Done")
}
/**
 * 여기서 본애는 쪽과 받는 쪽에 몇 가지 중요한 상태가 있다. 송신자는 SenedChannel에서 채널이
 * 꽉 차있는지, 즉 isFull 값이 true인지 살펴보고 꽉 차 있으면 일시 지연된다.
 * 만일 close()에 의해 닫으면 isClosedForSend가 true로 지정되어 isFull은 false를 반환할 수 있다.
 *
 * 수신자는 isEmpty가 true라면 비어 있으므로 가져갈게 없는 루틴은 일시 지연된다.
 * 마찬가지로 닫을 경우 isClosedForReceive에 의해 false를 반환할 수 있다.
 *
 * 그 밖의 SendChannel과 RecceiveChannel에는 다음과 같은 메서드를 사용할 수 있다.
 * SendChannel.offer(element:E):Bollean//가능하면 요소를 채널에 추가. 채널이 꽉 찼을 경우 false
 * ReceiveChannel.poll():E?//요소를 반환. 채널이 비어있으면 null을 반환
 *
 * 확장된 채널 자료형도 있음
 * RendezvousChannel: 내부에 버퍼를 두지 않는 채널이다. 모든 send동작은 receive가 즉각 가져가기
 * 전까지는 일시 중단된다. 물론 반대로 모든 receive도 누군가 send하기 전까지는 일시 중단된다.
 *
 * ArrayChannel: 특정한 크기로 고정된 버퍼를 가진 채널이다. 따라서 해당 버퍼가 꽉 차기 전까지
 * send가 지연되지 않고 보낼 수 있게 된다. receive도 버퍼가 비어 있기 전까지 계속 받을 수 있다.
 *
 * LinkedListChannel: 링크드 리스트 형태로 구성했기 때문에 버퍼의 크기에 제한이 없어 send 시
 * 일시 중단인 상태를 가지지 않는다. 다만 send를 지속할 경우 메모리 부족 오류를 만날 수 있다.
 * receive는 비어 있는 경우 일시 중단된다.
 *
 * ConflatedChannel: 버퍼는 하나의 요소만 허용하기 때문에 모든 send 동작은 일시 지연되 않음
 * 다만 기존의 값을 덮어 씌움
 */