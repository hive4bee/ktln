package chap07.section2

class Outer {
    val ov=5
    class Nested{
        val nv=10
        fun greeting()="[Nested] Hello! $nv"//외부의 ov에는 접근 불가
    }
    fun outside(){
        val msg=Nested().greeting()//객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}")//중첩 클래스의 프로퍼티 접근
    }
}

fun main(){
    //static 처럼 객체 생성 없이 사용
    val output=Outer.Nested().greeting()
    println(output)

    //Outer.outside()//오류! 외부 클래스의 경우는 객체를 생성해야 함
    val outer=Outer()
    outer.outside()

}
/**
 * 위 소스 코드를 보면 Outer 클래스 안에 Nested라는 중첩 클래스가 선언되어 있다.
 * 그리고 Outer.Nested().greeting()과 같은 방법으로 중첩 클래스의 메서드가 객체 생성 없이
 * 호출될 수 있다. 또한 외부 클래스의 메서드인 outside()에서 중첩 클래스의 멤버 greeting()에
 * 접근할 수 있다.
 *
 * 하지만 반대로 중첩 클래스에서 외부 클래스의 멤버인 ov와 같은 프로퍼티에 접근할 수 없다.
 *
 * 이처럼 중첩된 Nested 클래스는 바로 바깥 클래스인 Outer의 멤버에는 접근할 수 없다.
 * 그러면 바깥 클래스에 접근할 수 있는 방법이 있을까?
 * Outer클래스가 컴패니언 객체를 가지고 있을 때는 접근이 가능하다
 */