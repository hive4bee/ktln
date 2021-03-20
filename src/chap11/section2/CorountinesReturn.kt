package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
/**
 * 이렇게 launch를 통해 코루틴 블록을 만들어 내는 것을 코루틴 빌더의 생성이라고 한다.
 * launch 이외에도 코루틴 블록을 생성할 수 있는 몇 가지 방법이 있다.
 * launch는 현재 스레드를 차단하지 않고 새로운 코루틴을 실행할 수 있게 하며 특정 결과값 없이
 * Job객체를 반환한다. Job 객체를 받아 코루틴의 상태를 출력해본다.
 */
fun main(){
    val job:Job = GlobalScope.launch{
        delay(1000L)
        println("World!@")
    }
    println("Hello, ")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
}
/**
 * launch를 살펴보면 실행 범위를 결정하는 GlobalScope가 지정되어 있다. 이것은 코루틴의 생명 주기가
 * 프로그램의 생명 주기에 의존되므로 main()이 종료되면 같이 종료된다.
 * 코루틴을 실행하기 위해서는 내부적으로 스레드를 통해서 실행될 수 있다. 단, 실행 루틴이 많지 않은 경우에는
 * 내부적으로 하나의 스레드에서 여러 개의 코루틴을 실행할 수 있기 때문에 1개의 스레드면 충분한다.
 */