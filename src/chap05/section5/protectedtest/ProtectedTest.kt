package chap05.section5.protectedtest

open class Base {//최상위 클래스에는 protected를 사용할 수 없음
    protected var i=1
    protected fun protectedFunc(){
        i+=1//접근 허용
    }
    fun access(){
        protectedFunc()//접근 허용
    }
    protected class Nested//내부 클래스에는 지시자 허용
}
class Derived:Base(){
    fun test(base:Base):Int{
        protectedFunc()//Base클래스의 메서드 접근 가능
        return i//Base클래스의 프로퍼티 접근 가능
    }
}
fun main(){
    val base=Base()//생성 가능
    //base.i//접근불가
    //base.protectedFunc()//접근 불가
    base.access()//접근 가능
    val derived=Derived()
}
/**
 * protected 멤버 프로퍼티인 idhk 메서드 protectedFunc()는 하위 클래스인 Derived
 * 클래스에서 접근할 수 있다. protected로 지정된 멤버는 상속된 하위 클래스에서는 자유롭게
 * 접근이 가능하다. 다만 외부 클래스나 객체 생성 후 점 표기를 통해 protected멤버에 접근은 안된다.
 */