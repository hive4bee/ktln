package chap11.section4

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

val mutext = Mutex()

var counter0 = 0
fun main() = runBlocking {
    massiveRun {
        mutext.withLock {
            counter0++
        }
    }
    println("Counter = $counter0")
}
/**
 * 람다식 withLock을 사용하면 mutex.lock(); try{...}finally{mutex.unclock()}와 같은
 * 패턴을 사용할 수 있다.
*
 * Mutex에는 검사를 위한 프로퍼티 isLocked가 있다. isLocked는 mutex가 잠근 상태일 때
 * true를 반환한다. onLock은 잠금 상태로 들어갈 때 select표현식을 사용해 특정 지연 함수를
 * 선택할 수 있다.
 */