package chap05.section5.privatetest

private class PrivateClass {
    private var i=1
    private fun privateFunc(){
        i+=1
        //println("i:$i")
    }
    fun access(){
        privateFunc()
    }
}

class OtherClass{
    //val opc=PrivateClass()//불가-프로퍼티opc는 private이 되어야 함
    fun test(){
        val pc=PrivateClass()
    }
}
fun main(){
    val pc=PrivateClass()
    //pc.i//접근 불가능
    //pc.privateFunc()//접근 불가능
    pc.access()
}
fun TopFunction(){
    val tpc=PrivateClass()//객체 생성 가능
}
/**
 * PrivateClass클래스는 private으로 선언되어 있으므로 다른 파일에서 접근할 수 없다.
 * 같은 파일에서는 PrivateClass의 객체를 생성할 수 있다. 만일 다른 클래스에서
 * 프로퍼티로서 PrivateClass의 객체를 지정하려면 똑같이 private으로 선언해야 한다.
 * 객체를 생성했다고 하더라도 PrivateClass의 멤버인 i와 privateFunc()메서드가 private으로
 * 선언되었기 때문에 다른 클래스나 main()같은 최상위 함수에서 접근할 수 없다.
 * Private멤버는 해당 클래스 내부에서만 접근이 가능하다.
 */