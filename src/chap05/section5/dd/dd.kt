package chap05.section5.dd

open class Base {
    //이 클래스에서는 a,b,c,d,e 접근 가능
    private val a=1
    protected open val b=2
    internal val c=2
    val d=4

    class Nested(){
        //이 클래스에서는 a,b,c,d,e,f접근 가능
        public val e:Int =5
        private val f:Int=6
    }
}
class Derived:Base(){
    //이 클래스에서는 b,c,d,e 접근 가능
    //a는 접근 불가
    override val b=5;
}
class Other(base:Base){
    //base.a, base.b는 접근 불가
    //base.c와 base.d는 접근 가능(같은 모듈 안에 있으므로)
    //Base.Nested는 접근 불가, Nested::e역시 접근 불가
    val aa=Base()
}