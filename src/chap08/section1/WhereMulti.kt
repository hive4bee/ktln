package chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA:InterfaceA, InterfaceB
class HandlerB:InterfaceA

class ClassA<T> where T:InterfaceA, T:InterfaceB//2개의 인터페이스를 구현하는 클래스로 제한

fun main(){
    val obj1=ClassA<HandlerA>()
    //val obj2=ClassA<HandlerB>();//범위에 없으므로 오류 발생
}
/**
 * 위 예는 구체적으로 InterfaceA와 InterfaceB를 구현하는 클래스만 허용하려고 할 때는
 * 형식 매개변수의 사용범위를 지정하는 where 키워드를 사용할 수 있다.
 */
//다음은 함수에서 where 를 사용해서 두 조건을 만족하는 경우로 제한해 보
fun<T> myMax(a:T, b:T): T where T:Number, T:Comparable<T>{
    return if(a>b) a else b
}