package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {//main()함수가 코루틴 환경에서 실행
//    launch{//백그라운드로 코루틴 실행
//        delay(1000L)
//        println("World")
//    }
    val job = launch{
        delay(1000L)
        println("World!")
    }
    println("Hello")//즉시 이어서 실행됨
//    delay(2000L)//delay()함수를 사용하지 않아도 코루틴을 기다림
    job.join()//명시적으로 코루틴이 완료되길 기다림. 취소할 경우 job.cancel()함수를 사용한다.
}
/**
 * main()함수에서 블로킹 모드로 동작하기 때문에 main()함수 내부의 코루틴이 모두 작동할 때까지
 * delay()함수를 사용해 기다리지 않아도 자동적으로 블로킹하면서 제네릭에서 지정된 자료형인 <Unit>은
 * 생략가능하다. 코틀린1.3버전부터는 main()함수에도 suspend를 지정할 수 있다.
 *
 * 명시적으로 코루틴의 작업이 완료되는 것을 기다리게 하려면 Job객체의 join()함수를 사용하면 된다.
 * launch에서 반환하는 값은 Job객체이므로 이것을 이용해 main()함수에서 join()함수를 호출할 수 있다.
 *
 * Job은 백그라운드에서 실행하는 작업을 가리킨다. 개념적으로는 간단한 생명주기를 가지고 있고
 * 부모-자식 관계가 형성되면 부모가 작업이 취소될 때 하위 자식의 작업이 모두 취소한다. 보통
 * Job() 팩토리 함수나 launch에 의해 job 객체가 생성된다. job객체는
 * New, Active(기본값 상태), Completing, Canceling, Canceled(최종상태), Completed(최종상태)
 */

