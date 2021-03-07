package chap08.section1

fun<T> add(a:T, b:T, op:(T, T)->T):T{
    return op(a,b)
}
fun main(){
    val result=add(2,3,{a,b ->a+b})
    println(result)
    val cc=CCl("hello", "world")
    hel2(cc, hel)
}
var sumInt:(Int, Int) -> Int = {a,b ->a+b}//변수 선언부가 있는 경우 표현식의 자료형 생략
var subInt2={a:Int,b:Int->a+b}//변수 선언부가 생략된 경우에는 표현식에 자료현 표기
var subInt3:(Int,Int)->Int={a:Int,b:Int->a+b}

class CCl(var c1:String="c1", var c2:String="c2"){
    fun cFun(){
        println("c1=${c1} / c2=${c2}")
    }
}

var hel:(CCl)->Unit={ccl -> ccl.cFun()}
fun hel2(ccl:CCl, out:(CCl)->Unit){
    out(ccl)
}